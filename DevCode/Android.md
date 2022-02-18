# Android 코드 규약

Section: Android

1. 클래스 명은 `PascalCase`, 변수명은 `camelCase`, 안드로이드 화면 구성요소의 ID 및 자바 코드 변수명은 `Hungarian Notation` + `PascalCase` 표기법을 사용한다.
    또한 `Hungarian Notation`는 담당자가 자료형 표기를 정하고 문서화 한다.
2. 변수명은 직관적으로 작성하며 상수명은 영어 대문자만을 사용한다.
3. 들여쓰기는 탭을 사용한다.
4. 괄호는 K&R 스타일을 사용한다.

    ```android
    //K&R스타일 예시
    if(조건){
        실행 코드
    }
    ```

5. 라이브러리 호출은 코드 최상단에 위치한다.
6. 메소드 체이닝은 최대 2개까지만 그 이상 필요한 경우에는 변수를 생성하여 처리한다.
7. 조건문, 반복문 사용시 한줄 코딩 자제한다.

    ```android
    //한줄 코딩 예시
    if(조건){실행 코드}
    ```

8. boolean 자료형은 변수를 생성하여 사용한다.

    ```android
    //잘못된 예시
    while(true){
        실행코드
    }
    //바른 예시
    boolean startWhile = true;
    while(startWhile){
        실행코드
    }
    ```

9. 주석처리는 프로젝트 공통 규약을 따른다.
10. 이외의 사항에 대해서는 AOSP 자바 코드 스타일(<https://source.android.com/setup/contribute/code-style>)을 따른다.
