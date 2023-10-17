package dev.potatoo.travel.dbkey.service;

import dev.potatoo.travel.area.response.ApiResponseArea;
import dev.potatoo.travel.common.utils.EncryptionUtils;
import dev.potatoo.travel.dbkey.request.DbRequest;
import dev.potatoo.travel.dbkey.response.DbResponse;
import dev.potatoo.travel.domain.core.DbKey;
import dev.potatoo.travel.domain.repository.DbKeyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class DbService {
    private final DbKeyRepository dbKeyRepository;

    public DbResponse checkDbKey(DbRequest dbRequest) {

        String clientSHA256 = EncryptionUtils.encryptSHA256(dbRequest.getDbKey());

        log.info("API 값 :" + clientSHA256);

        //serverSHA256

        log.info("DB에서 가져온 값 : " + dbKeyRepository.findAll());

        return null; //여기까지
    }
}
