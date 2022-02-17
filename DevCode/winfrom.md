# C# 코드 규약
Section : Winform

- ## 명명규칙  
    1. 정규화된 클래스의 이름이 한줄에 길게 표지되지 않게 합니다.  
        > 즉, 포함되어 있는 모든 `namespace`를 설정할 필요는 없습니다.
        ```csharp
        // 잘못된 명명 방법
        System.Diagnostics.PerformanceCounterCategory category = new System.Diagnostics.PerformanceCounterCategory(); 
        // 지시문은 var로 대체하여 최대한 간결하게 사용하고 선언문의 네임스페이스는 using을 사용하여 한줄의 코딩 표기를 최대한 줄인다.
        using System.Diagnostics;
        var category = new PerformanceCounterCategory();
        ```
    2. 괄호 앞은 반드시 개행이다.
        ```csharp
        if(a == 1)
        {
        }
        ```

- ## 레이아웃 규칙
    1. 4자 들여쓰기, 공백으로 저장된 탭을 사용합니다.  

    2. 한 줄에 하나의 문장만 씁니다.
        ```csharp
        //잘못된 코딩 방법
        if(a > 0) for(int i = 0; i < 10; i++) Console.WriteLine(i);
        //올바른 코딩 방법
        if(a > 0)
        {
            for(int i = 0; i < 10; i++){
                Console.WriteLine(i);
            }
        }
        ```
    3. 연속적인 체인식 함수 선언이 자동으로 들여 쓰기되지 않으면 탭 간격으로 한칸 들여씁니다.
        > Linq식의 경우는, .Where .Select의 연속된 처리식이 가능합니다만 라인을 바꿀 때는 꼭 들여쓰기를 통해 구분을 정합니다.
        ```csharp
        List.Where(x => x.IsCheck)
            .Select(x => x.Data);
        ```
    4. 메소드 정의와 프로퍼티 정의 사이에 적어도 하나의 공백행을 추가합니다.
        > 위아래로 자동으로 공백이 생기지 않는다면 임의로 집어넣는다.
        ```csharp
        public void SetData (int a)
        {
        }

        public void GetData (int a)
        {
        }
        ```
    5. 이벤트 메소드의 경우 별도의 파일을 만들어 관리합니다.
- ## 코멘트 규칙
    1. 주석은 함수 혹은 변수, 해당 코드의 상단에 작성한다.
    > 영어로 작성할 경우  
    > 1. 대문자로 주석 텍스트를 시작합니다.
    > 2. 마침표가 있는 설명 텍스트로 끝냅니다.
    ```csharp
    //데이터를 불러오는 메소드
    public void SetData (int a)
    {
    }
    //데이터를 가져오는 메소드
    public void GetData (int a)
    {
    }
    ```
- ## 언어 규칙
    1. 문자열 데이터 형식
        > 가능한 보간법을 사용합니다.
        ```csharp
        int data = 10;
        Console.WriteLine($"Hello world {data}");
        ```
    2. 암시적 변수형 타입
        > 변수 타입이 정확하거나 별도의 구분이 필요 없을 경우 var를 사용한다.  
        > `for와 foreach에서는 반드시 var타입을 사용합니다.`
        ```csharp
        for(var i = 0; i < 100; i++)
        {
        }

        foreach(var data in List)
        {
        }
        ```
    3. 배열은 최대한 간결하게 선언합니다.
        ```csharp
        string[] vowels1 = { "a", "e", "i", "o", "u" };
        var vowels2 = new string[] { "a", "e", "i", "o", "u" };
        ```
    4. 예외처리는 try ~ catch를 사용합니다.

