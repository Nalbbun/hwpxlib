
# hwpxlib

한글과 컴퓨터(한컴)에서 만든 워드프로세서 "한글"의 hwpx 파일에 대한 라이브러리입니다.<br>
이 라이브러리는 hwpx 파일을 읽고 쓸 수 있는 java 라이브러리 입니다.

개인적인 취미 생활 또는 사회기여 활동 목적으로 시작한 hwplib, hwpxlib 프로젝트가 이 라이브러리를 기반으로 하는 상용 제품이 개발하여 판매하고 있습니다.
이 라이브러리의 저작권은 저 개인에게 있으므로, 라이브러리 사용, 버그 수정요청, 약간의 질문 등은 Apache-2.0 license에 의해 앞으로도 자유롭게 할 수 있습니다.
그 외에 많은 시간을 초래할 수 있는 기술지원 요청이나 유지보수 계약등은 제 메일로 상의해 주셨으면 합니다. <br>

* 사용한 라이브러리나 문서 
	- 한글과컴퓨터에서 공개한 'OWPML' 문서 ( http://www.hancom.com/etc/hwpDownload.do?gnb0=269&gnb1=271&gnb0=101&gnb1=140 ) <br>
	  ( “본 제품은 한글과컴퓨터의 HWP 문서 파일(.hwp) 공개 문서를 참고하여 개발하였습니다." )

* hwp 파일에 대한 라이브러리는 https://github.com/neolord0/hwplib 을 참조해 주세요.

2023.9.12
=========================================================================================
* 이슈7: LineWidth.MM_0_7의 인덱스를 7 ==> 9로 변경
* Bullet에서 paraHeadList => paraHead 로 변경
* ValuesByLanguage set()함수 변경 
* LineType1에 THICK 값 추가 
* JDK 1.7 버전으로 변경
* write시 null 에러 수정..

2023.8.18
=========================================================================================
* 이슈 6: connectLine 안에 <hp:controlPoints>가 포함된 파일을 읽을 떄 오류나는 문제 해결,
* text 안에 < > 있을 때 &lt; &gt;로 변환

2023.8.9
=========================================================================================
* 이슈 5: shapeObject 안에 <hp:parameterset>가 포함된 파일을 읽을 떄 오류나는 문제 해결, 
* UnsignedIntegerParam 추가..
  
2023.7.28
=========================================================================================
* 이슈 4: <hh:head> 안에 <hh:metaTag>가 포함된 파일을 읽을 떄 오류나는 문제 해결 
* 한 노드에 <switchObject> 노드가 여러 개 포함될 때 처리...

2023.5.3
=========================================================================================
* 객체 찾기 기능(ObjectFinder) 추가 (사용법은 테스트 코드 참조)
* 빈 파일 생성 기능(BlankFileMaker) 추가 (사용법은 테스트 코드 참조)
* 텍스트 추출 기능(TextExtractor) 추가 (사용법은 테스트 코드 참조)

2023.4.26
=========================================================================================
* 이슈 3: Chart가 포함된 파일을 읽을 때 오류나는 문제 해결

2023.4.13
=========================================================================================
* 이슈 1: settings.xml 의 configitemset 부분이 구버전과 다른 문제 해결


2023.3.13
=========================================================================================
* 라이브러리 최초 공걔
