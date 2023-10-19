package dev.potatoo.travel.dbkey.service;

import dev.potatoo.travel.area.response.ApiResponse;
import dev.potatoo.travel.area.service.AreaService;
import dev.potatoo.travel.common.utils.EncryptionUtils;
import dev.potatoo.travel.dbkey.request.DbRequest;
import dev.potatoo.travel.domain.core.DbKey;
import dev.potatoo.travel.domain.repository.DbKeyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class DbService {
    private final AreaService areaService;
    private final DbKeyRepository dbKeyRepository;

    public ApiResponse checkDbKey(DbRequest dbRequest) {

        log.info(dbRequest.getDbKey());
        log.info(dbRequest.getUpsertArea());
        log.info(dbRequest.getApiRequest().getLocation());

        ApiResponse apiResponse = null;
        String clientSHA256 = EncryptionUtils.encryptSHA256(dbRequest.getDbKey());

        List<DbKey> serverSHA256List = dbKeyRepository.findAll();

        String serverSHA256 = serverSHA256List.get(0).getDbKey();


        if (clientSHA256.equals(serverSHA256)) {
            log.info("clientSHA256 : " + clientSHA256);
            log.info("serverSHA256 : " + serverSHA256);

            String upSert = dbRequest.getUpsertArea();

            switch (upSert) {
                case "insert" :
                    apiResponse = areaService.insertArea(dbRequest.getApiRequest());
                    break;

                case "update" :
                    apiResponse = areaService.updateArea(dbRequest.getApiRequest());
                    break;
            }

        } else {
            log.info("clientSHA256 : " + clientSHA256);
            log.info("serverSHA256 : " + serverSHA256);

            apiResponse = new ApiResponse().builder()
                    .message("색칠에 실패했습니다. 비밀번호를 확인해 주세요.")
                    .build();

        }

        return apiResponse;
    }
}
