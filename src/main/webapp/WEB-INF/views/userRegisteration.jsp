<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="module/css/userRegisteration.css" />
</head>
<body>
      <p id="joinTitle">회원가입</p>
      <div id="registerForm">
         <form action="/jointest" method="post">
            <p>이름</p> <!-- 각 입력창들의 name을 dto와 일치시켜주면 컨트롤러에서 사용이 쉬움 -->
            <input class="registerBox" type="text" name="user_name" placeholder="이름을 입력하세요"><br>
            <p>아이디</p>
            <input class="registerBox" type="text" name="user_id" placeholder="아이디를 입력하세요"> <button id="sameBtn">중복확인</button><br>
            <p>패스워드</p>
            <input class="registerBox" type="password" name="user_password" placeholder="패스워드를 입력하세요"><br>
            <p>패스워드 확인</p>
            <input class="registerBox" type="password" name="passwordGood" placeholder="패스워드를 확인하세요"><br>
            <p>이메일</p>
            <input class="registerBox" type="text" name="user_email" placeholder="이메일을 입력하세요"><br>
            <input type="submit" style="margin-left:140px;" value="회원가입">
            <button> <a href="/">뒤로가기</a> </button>
        </form>
    </div>
</body>
</html>