
    document.getElementById('btn1').addEventListener('click', addAct);
    let msg = document.getElementById('msg');
    let actTitle = document.getElementById("actTitle");
    let actContent = document.getElementById("actContent");
    let typeOption = document.getElementById("typeOption");
    let locOption = document.getElementById("locOption");
    let address = document.getElementById("address");
    let enrollStart = document.getElementById("enrollStart");
    let enrollEnd = document.getElementById("enrollEnd");
    let actBegin = document.getElementById("actBegin");
    let actEnd = document.getElementById("actEnd");
    let minCount = document.getElementById("minCount");
    let maxCount = document.getElementById("maxCount");
    let inputFile = document.getElementById("inputFile");
    // let timeTest = document.getElementById("timeTest");

//  錯誤訊息 tag
    let title = document.querySelector("#title");
    let type = document.querySelector("#type");
    let actlocation = document.querySelector("#location");
    let addr = document.querySelector("#addr");
    let time = document.querySelector("#time");
    let min = document.querySelector("#min");
    let max = document.querySelector("#max");
    let actDescribe = document.querySelector("#actDescribe");
    let image = document.querySelector("#image");
    
    let url = "/CGA103G1/createAct";
    
    function addAct(e){
        e.preventDefault();
        // console.log(enrollStart.value);
        // console.log((enrollStart.value).replace("T"," ").concat(":00"));
        // console.log((enrollEnd.value).replace("T"," ").concat(":00"));
        // console.log((actBegin.value).replace("T"," ").concat(":00"));
        // console.log((actEnd.value).replace("T"," ").concat(":00"));

        // if(timeTest.value > (enrollStart.value).replace("T"," ").concat(":00")){
        //     console.log("大於");
        // }else{
        //     console.log("小於");
        // }


        const actTitleLength = actTitle.value.length;
        const actContentLength = actContent.value.length;
        const typeOptionV = typeOption.value;
        const locOptionV = locOption.value;
        const addressLength = address.value.length;
        const enrollStartLength = enrollStart.value.length;
        const enrollEndLength = enrollEnd.value.length;
        const actBeginLength = actBegin.value.length;
        const actEndLength = actEnd.value.length;
        const minCountV = minCount.value;
        const maxCountV = maxCount.value;
        const inputFileLength = inputFile.length;
        let flag = true;
        // function validate(){
            if(actTitleLength === 0 || actTitle.value === "" || actTitle.value === null){
                title.textContent = "活動名稱有誤，不得空白";
                // flag = false;
            }
    
            if(actContentLength === 0 || actContent.value === "" || actContent.value === null ){
                actDescribe.textContent = "活動說明有誤，不得空白";
                // flag = false;
            }
            if(addressLength === 0 || address.value === "" || address.value === null ){
                addr.textContent = "活動地址有誤，不得空白";
                // flag = false;
            }
            if(enrollStart.value === null || enrollEnd.value === null 
                || actBegin.value === null || actEnd.value === null || enrollStart.value === "" || enrollEnd.value === "" 
                || actBegin.value === "" || actEnd.value === "" || enrollStart.value === undefined || enrollEnd.value === undefined 
                || actBegin.value === undefined || actEnd.value === undefined){
                time.textContent = "任一時間不得空白";
                // flag = false;
            }else if(enrollStart.value > enrollEnd.value ||
                enrollEnd.value >  actBegin.value ||
                actBegin.value > actEnd.value){
                time.textContent = 
                "時間有誤，活動報名開始時間不得大於截止時間 / 活動開始時間不得大於結束時間 / 活動報名截止時間不得大於活動開始時間";
                // flag = false;
            }
    
            if(inputFileLength === 0 || inputFile.value === ""){
                image.textContent = "請上傳一張照片"
                // flag = false;
            }
            if(typeOptionV === null || typeOptionV > 7 || typeOptionV < 1){
                type.textContent = "活動種類請勿空白"
                // flag = false;
            }
            if(locOptionV === null || locOptionV > 20 || locOptionV < 1){
                actlocation.textContent = "活動舉辦縣市有誤，不得空白"
                // flag = false;
            }
            if(minCountV === null || minCountV === 0 || minCountV < 1 || 
                maxCountV === null || maxCountV === 0 || maxCountV < 1 ||
                 minCountV > maxCountV){
                min.textContent = "最小人數限制有誤，不得大於最大人數限制或空白"
                max.textContent = "最大人數限制有誤，不得小於最小人數限制或空白"       
                return;
            }
        // }
    
        // fetch(url,
        // {
        //     method:"POST",
        //     headers: {
        //         'Accept': 'application/json, text/plain, */*',
        //         'Content-Type': 'application/json, application/x-www-form-urlencoded, multipart/form-data',
        //     },
        //     body:
        //     JSON.stringify({
        //         act_title: actTitle.value,
        //         act_content: actContent.value,
        //         act_type_no: typeOption.value,
        //         act_loc: locOption.value,
        //         act_pl: address.value,
        //         act_enroll_begin: (enrollStart.value).replace("T"," ").concat(":00"),
        //         act_enroll_end: (enrollEnd.value).replace("T"," ").concat(":00"),
        //         act_start: (actBegin.value).replace("T"," ").concat(":00"),
        //         act_end: (actEnd.value).replace("T"," ").concat(":00"),
        //         act_min_count: minCount.value,
        //         act_max_count: maxCount.value,
        //     }),
        // })
        // .then(res => {
        //   if(res.ok){
        //     res.json();
        //     msg.className = "success";
        //     msg.textContent = "創建揪團活動成功";
        //   }else{
        //     msg.className = "fail";
        //     msg.textContent = "創建揪團活動失敗";
        //   }
        // })
        // .then((data) => console.log(data))
        // .catch(
        //     error => console.log(error)
        // );
        
        // fetch("/CGA103G1/uploadActImage",
        // {
        //     method:"POST",
        //     headers:{
        //         'Content-Type': 'multipart/form-data',
        //     },
        //     body:inputFile.files[0]
        // }).catch(
        //     error => console.log(error)
        // );
        
        // const inputs = document.querySelectorAll('input, textarea, #uploadImg');
        // inputs.forEach(input => {
        // input.value = '';
        // });     
    }
