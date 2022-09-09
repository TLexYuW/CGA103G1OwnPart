---
tags: Java, JavaScript, HTML, CSS, JSP, EL, Servlet, Hibernate, MySQL
---
# CGA103G1 - Project Practice ( 旅遊平台 - 揪團活動&討論區 功能實作 ) 
*專題整合 URL︰[CGA103G1 TravelPlatform](https://github.com/MyCorpLexTW/CGA103G1)*
## 目錄 TOC
1. [揪團活動 Activity](#揪團活動)
   - [使用技術 Tech](#使用技術)
   - [實作功能說明 Function DESC.](#實作功能)
2. [討論區 Forum](#討論區)
   - [使用技術 Tech](#使用技術)
   - [實作功能說明 Function DESC.](#實作功能)
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
	
	W -->|Ajax & Fetch & JSON & GSON| Svl -->|JavaBean| S -->|JavaBean| M -->|JDBC| DB
	
	DB -->|JDBC| M -->|JavaBean| S -->|JavaBean| Svl -->|Ajax & Fetch & JSON & GSON| W
```
#### 實作功能
1. 會員可於平台 - 會員中心 創建揪團活動 (CreateActServlet.java)
   - 若任一欄位空白，經過驗證，則會回傳錯誤訊息提示
   - 資料填寫完畢，送出
2. 於活動瀏覽頁依條件進行搜尋各類活動
3. 點選其中一個活動，進入活動詳細頁面
   - 點擊加入任一其他會員所創立之揪團活動，DB成功新增
   - 若已加入過，則回傳警示訊息告知已在揪團活動中
   - 或者人數已達最多人數限制，則回傳警示訊息告知活動已達人數限制無法加入
4. 
5. 

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
