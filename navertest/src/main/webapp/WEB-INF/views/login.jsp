<html lang="ko">
<head>
<script type="text/javascript" src="https://static.nid.naver.com/js/naverLogin_implicit-1.0.3.js" charset="utf-8"></script>
</head>
<body>
<!-- 네이버 로그인 버튼 노출 영역 -->
<div id="naver_id_login"></div>
<!-- //네이버 로그인 버튼 노출 영역 -->


<!-- 네이버아디디로로그인 초기화 Script -->
<script type="text/javascript">
	var naver_id_login = new naver_id_login("등록한 ClientID 값", "등록한 Callback URL 값");
	var state = naver_id_login.getUniqState();
	naver_id_login.setButton("white", 2,40);
	naver_id_login.setDomain(".service.com");
	naver_id_login.setState(state);
	naver_id_login.setPopup();
	naver_id_login.init_naver_id_login();
</script>
<!-- // 네이버 로그인 초기화 Script -->
</body>
</html>