# TRAVEL_PROJECT_RESTAPI

### AWS 메모리 모잘라서 swap함 
AWS에 젠킨스 설치 후 build gradle 하면 메모리 부족으로 서버 먹통됨...
기존 메모리 1gb에서 2g swap 하여 총 3기가로 사용중.. 
--> t3a.medium 으로 변경 ( ram : 4gb ) --> 자작 nas 연결 ( AWS + Home Server)

### 로그 안나오게 프로퍼티 설정 변경
임시 : nobup 사용하여 jar파일 해제하며 내장톰캣을 이용한 서버 배포
log4j 써서 좀더 로그 보이게 해볼까..생각중..

spring boot / gradle 
