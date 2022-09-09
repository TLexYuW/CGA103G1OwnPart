---
tags: Java, JavaScript, JQuery, Ajax, Fetch, JSON, HTML, CSS, Bootstrap, JSP, EL, Servlet, Hibernate, MySQL
---
# CGA103G1 - Project Practice ( 旅遊平台 - 揪團活動&討論區 功能實作 ) 
*專題整合 URL︰[CGA103G1 TravelPlatform](https://github.com/MyCorpLexTW/CGA103G1)*
## 目錄 TOC
1. [揪團活動 Activity](#揪團活動)
   - [使用技術 Tech](#使用技術)
   - [實作功能說明 Function Description](#實作功能)
2. [討論區 Forum](#討論區)
   - [使用技術 Tech](#使用技術)
   - [實作功能說明 Function Description](#實作功能)
3. [ProjectTree](#ProjectTree)


### 揪團活動
#### 使用技術
```mermaid
flowchart LR
	W[HTML & CSS & JavaScript & JQuery]
	Svl[Controller / Servlet]
	S[Service]
	M[DAO]
	DB[(MySQL)]
	
	subgraph Database
		DB
	end
	
	subgraph Backend
		Svl
		S
		M
	end
	
	subgraph Frontend
		W
	end
	
	W -->|Ajax & Fetch & JSON| Svl -->|JavaBean| S -->|JavaBean| M -->|JDBC| DB
	
	DB -->|JDBC| M -->|JavaBean| S -->|JavaBean| Svl -->|Ajax & Fetch & JSON| W
```
#### 實作功能
會員可於平台網站內進行以下操作
1. 於會員中心內選擇 `創建揪團活動` 
   - 若任一欄位空白，點擊`創建揪團`按鈕，經過驗證，則會回傳錯誤訊息提示
   - 資料填寫完畢，再次點擊，會顯示`創建揪團活動成功`，若回傳失敗，後端發生錯誤，則顯示`創建揪團活動失敗`
```mermaid
flowchart LR
	aC[actCreate.html] --> cA[createAct.js] --> CAS[CreateActServlet.java]
```
2. 於活動瀏覽頁選擇想要的條件進行搜索各類活動，並產生清單列表 
```mermaid
flowchart LR
	aSLP[actSearchListPage.html ] --> aSLPjs[actSearchListPage.js] --> GAAS[GetAllActServlet.java]
```     
3. 點選列表內其中之一活動，進入該活動詳細頁面，
   - 點擊`確定加入`按鈕，畫面顯示`加入成功`訊息
   - 若已加入過，則回傳訊息告知`你已經加入過此活動`
   - 或者人數已達最多人數限制，則回傳訊息告知`活動已超過最大人數限制，無法加入`
   - 若為其他錯誤，則顯示`加入失敗`
```mermaid
flowchart LR
	aDJP[actDetailJoinPage.html ] --> gOADP[getOneActDetailPage.js] -->|Fetch Request| GOAS[GetOneActServlet.java]
	GOAS -->|使用GSON將資料轉JSON格式| gOADP -->|Fetch Response| aDJP
	aDJP[actDetailJoinPage.html ] --> aDJ[actDetailJoin.js] --> JAS[JoinActServlet.java]
``` 
1. 
2. 於會員中心內選擇 `查詢揪團紀錄` 
   - 點擊`查詢已參加之活動` ，會顯示所有已報名參加之活動列表
   - 如無參與任何活動，則回傳訊息`目前您無主辦任何活動`
6. 修改

### 討論區
#### 使用技術
```mermaid
flowchart LR
	J[JSP + EL]
	Svl[Controller / Servlet]
	S[Service]
	M[DAO]
	DB[(MySQL)]
	
	subgraph Database
		DB
	end
	
	subgraph Backend
		Svl
		S
		M
	end
	
	subgraph Frontend
		J
	end
	
	J -->|JavaBean| Svl -->|JavaBean| S -->|JavaBean| M -->|Hibernate| DB
	
	DB -->|Hibernate| M -->|JavaBean| S -->|JavaBean| Svl -->|JavaBean| J
```
#### 實作功能


### ProjectTree
```bash
.
|-- pom.xml
`-- src
    `-- main
        |-- java
        |   `-- com
        |       |-- ac
        |       |   |-- controller
        |       |   |   |-- CreateAcServlet.java
        |       |   |   |-- GetOneAcServlet.java
        |       |   |   `-- UpdateAcServlet.java
        |       |   `-- model
        |       |       |-- AcDAO.java
        |       |       |-- AcDAOImpl.java
        |       |       |-- AcDAOImplTest.java
        |       |       |-- AcService.java
        |       |       |-- AcServiceImpl.java
        |       |       `-- AcVO.java
        |       |-- ac_pic
        |       |   |-- controller
        |       |   |   `-- GetOneAcImageServlet.java
        |       |   `-- model
        |       |       |-- AcPicDAO.java
        |       |       |-- AcPicService.java
        |       |       |-- AcPicVO.java
        |       |       `-- I_AcPicDAO.java
        |       |-- act
        |       |   |-- controller
        |       |   |   |-- CreateActServlet.java
        |       |   |   |-- GetActHostServlet.java
        |       |   |   |-- GetAllActServlet.java
        |       |   |   |-- GetMemOneActServlet.java
        |       |   |   |-- GetOneActServlet.java
        |       |   |   |-- GetOwnActServlet.java
        |       |   |   |-- HostQueryAjaxServlet.java
        |       |   |   |-- RedirectDetailPageServlet.java
        |       |   |   |-- UpdateActConditionServlet.java
        |       |   |   `-- UpdateActPeopleAmount.java
        |       |   `-- model
        |       |       |-- ActDAO.java
        |       |       `-- I_ActDAO.java
        |       |-- act_participant
        |       |   |-- controller
        |       |   |   `-- JoinActServlet.java
        |       |   `-- model
        |       |       |-- ActParticipantDAO.java
        |       |       `-- I_ActParticipantDAO.java
        |       |-- act_pic
        |       |   |-- controller
        |       |   |   |-- GetAllActPicServlet.java
        |       |   |   |-- GetOneActPicServlet.java
        |       |   |   |-- UpdateActImageServlet.java
        |       |   |   `-- UploadActImageServlet.java
        |       |   `-- model
        |       |       |-- ActPicDAO.java
        |       |       `-- I_ActPicDAO.java
        |       |-- act_type
        |       |   |-- controller
        |       |   `-- model
        |       |       |-- ActTypeDAO.java
        |       |       `-- I_ActTypeDAO.java
        |       |-- mem
        |       |   `-- model
        |       |       |-- I_MemDAO.java
        |       |       `-- MemjdbcDAO.java
        |       |-- testany
        |       |   |-- demo
        |       |   |   |-- HibernateQueryPractice.java
        |       |   |   `-- TestJndi.java
        |       |   `-- model
        |       |       |-- Emp2.java
        |       |       `-- testAc.java
        |       `-- util
        |           |-- CoreDao.java
        |           |-- CoreService.java
        |           |-- DataSourceUtil.java
        |           |-- HibernateUtil.java
        |           |-- JdbcUtil.java
        |           |-- LocalDateTimeDeserializer.java
        |           |-- LocalDateTimeSerializer.java
        |           |-- TestMain.java
        |           |-- TestRedis.java
        |           `-- setSessionValueServlet.java
        |-- resources
        |   `-- hibernate.cfg.xml
        `-- webapp
            |-- META-INF
            |   |-- context.xml
            |   `-- selfUse.txt
            |-- WEB-INF
            |   `-- web.xml
            |-- backend
            |   `-- act
            `-- frontend
                |-- ac
                |   |-- acCardPage.jsp
                |   |-- acCreate.jsp
                |   |-- acDetailPage.jsp
                |   |-- acSelfCardPage.jsp
                |   `-- acUpdate.jsp
                |-- act
                |   |-- actBanner.html
                |   |-- actCreate.html
                |   |-- actDetailJoinPage.html
                |   |-- actMemBanner.html
                |   |-- actMemQuery.html
                |   |-- actMemSideBar.html
                |   |-- actMemUpdate2.html
                |   |-- actSearchListPage.html
                |   |-- footer.html
                |   |-- header.html
                |   |-- memPage.html
                |   |-- ownJS
                |   |   |-- actDetailJoin.js
                |   |   |-- actMemQuery.js
                |   |   |-- actMemUpdate2.js
                |   |   |-- actSearchListPage.js
                |   |   |-- createAct.js
                |   |   |-- getOneActDetailPage.js
                |   |   |-- includeActBanner.js
                |   |   |-- includeFooterHeader.js
                |   |   |-- includePart.js
                |   |   `-- ......
                |   |-- ......
                |-- assets
                |   |-- ......
                |   `-- ......
                |-- commonCSS.file
                |-- commonJS.file
                |-- footer.file
                |-- header.file
                |-- homePage.js
                |-- homePage.jsp
                |-- homePageBanner.file
                |-- memSidebar.file
                `-- ......
```
