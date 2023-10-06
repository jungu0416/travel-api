package dev.potatoo.travel.dbkey.service;

import dev.potatoo.travel.common.utils.EncryptionUtils;
import dev.potatoo.travel.dbkey.request.DbRequest;
import dev.potatoo.travel.dbkey.response.DbResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class DbService {


    public DbResponse checkDbKey(DbRequest dbRequest) {

        String test = EncryptionUtils.encryptSHA256(dbRequest.getDbKey());

        log.info(test);

        return null; //여기까지
    }
}
