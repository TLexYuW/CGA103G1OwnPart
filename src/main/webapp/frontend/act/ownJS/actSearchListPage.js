$(document).ready(function (){
    $("#actAll").on('click',function(){
        $("#actCount").html(0);   
        $.ajax({
                url:"/CGA103G1/getAllAct",
                data:"action=doPost",
                type:"POST",
                dataType : "json",
                success:function (data) {
                      // let output = "";
                      let result = "";
                      console.log(data);
                      // count = Object.keys(data).length;
                      // console.log(count);         
                    
                      data.forEach(function(actVO){
                        
                        if(actVO.act_status === 0){
                          actVO.act_status = "揪團中";                
                        }else if(actVO.act_status === 1){
                          actVO.act_status = "已成團";
                        };

                        let locationArr = ["臺北市" ,'新北市','桃園市','臺中市',"臺南市","高雄市","宜蘭縣","新竹縣","苗栗縣","彰化縣",
                        "南投縣","雲林縣","嘉義縣","屏東縣","花蓮縣","臺東縣","澎湖縣","基隆市","新竹市","嘉義市"];
                        for (let i = 0; i < locationArr.length; i++) {
                          if(actVO.act_loc === i+1){
                            actVO.act_loc = locationArr[i];
                          }
                        };

                        let starRate = 0;
                        if(actVO.act_rate_sum === 0 || actVO.act_eval_sum === 0){
                          starRate = 0;
                        }else{
                          starRate = (actVO.act_rate_sum / actVO.act_eval_sum);
                        }

                        result += actList(actVO, starRate);
                      // output += `
                      //   <div class="row">
                      //     <div class="col-md-12 col-sm-12 col-xs-12">
                      //       <div class="row listroBox">
                      //         <div class="col-lg-5 col-md-5 col-sm-6 col-xs-12 Nopadding">
                      //           <figure> 
                      //             <a href="activity-detailed-view.html" class="wishlist_bt"></a>
                      //             <a href="activity-detailed-view.html" id="imageList">
                      //             <img src="" class="img-fluid" alt="" id="imgTest">
                      //               <div class="read_more"><span>Read more</span></div>
                      //               </a> 
                      //           </figure>
                      //         </div>
                      //         <div class="col-lg-7 col-md-7 col-sm-6 col-xs-12 Nopadding">
                      //           <div class="listroBoxmain">
                      //             <h3><a href="activity-detailed-view.html" alt="揪團活動詳情頁面">${actVO.act_title}</a></h3>
                      //             <p>${actVO.act_content}</p>
                      //           </div>
                      //           <ul>
                      //             <li><span class="Ropen">${actVO.act_status}</span></li>
                      //             <li>
                      //               <div class="R_retings"><span>${actVO.act_loc}<em>${actVO.eval_sum} 評價總人數</em></span><strong>${actVO.act_rate_sum} 評價平均星數</strong></div>
                      //             </li>
                      //           </ul>
                      //         </div>
                      //       </div>
                      //     </div>
                      //   </div>
                      //       `;                 
                      });
                    $("#actCount").html(data.length);    					
                    $("#actListDiv").html(result);            
                }
              });
        // $.ajax({
        //   url:"/CGA103G1/getOneActPic",
        //   // data:{action : doGet, actNo : `${actVO.act_no}`},
        //   type:"GET",
        //   dataType:"*/*",
        //   success:function(result){
        //     let imgTag = $("#imgTest");
        //     console.log(result);
        //     imgTag.attr("src", result);
        //   }
        // });
    });
  }
);
{/* <a href="/CGA103G1/getOneAct?action=actInner&actNo=${actVO.act_no}" class="wishlist_bt"></a> */}
{/* <a href="/CGA103G1/getOneAct?action=actInner&actNo=${actVO.act_no}" id="imageList"> */}
{/* <a href="/CGA103G1/getOneAct?action=actInner&actNo=${actVO.act_no}" class="wishlist_bt">
</a> */}
function actList(actVO, starRate){
  let output = "";
  output += `
      <div class="row">
        <div class="col-md-12 col-sm-12 col-xs-12">
          <div class="row listroBox">
            <div class="col-lg-5 col-md-5 col-sm-6 col-xs-12 Nopadding">
              <figure> 
                <a href="/CGA103G1/getOneAct?action=actInner&actNo=${actVO.act_no}" id="imageList">
                <div class="read_more"><span>Read more</span></div>
                </a> 
                <img src="/CGA103G1/getOneActPic?action=actImg&actNo=${actVO.act_no}" class="img-fluid" alt="">
              </figure>
            </div>
            <div class="col-lg-7 col-md-7 col-sm-6 col-xs-12 Nopadding">
              <div class="listroBoxmain">
                <h3><a href="activity-detailed-view.html" alt="揪團活動詳情頁面">${actVO.act_title}</a></h3>
                <p>${actVO.act_content}</p>
              </div>
              <ul>
                <li><span class="Ropen">${actVO.act_status}</span></li>
                <li>
                  <div class="R_retings"><span><em>舉辦縣市：</em> ${actVO.act_loc}</span><strong> ${starRate} 平均星數</strong></div>
                </li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    `;    
  return output;             
}