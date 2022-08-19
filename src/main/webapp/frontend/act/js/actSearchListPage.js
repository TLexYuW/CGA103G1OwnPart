$(document).ready(function (){
    // 1. radio click 全部 顯示 所有活動列表( 已取消除外 )
    $("#actAll").change(function(){
        // alert("觸發了");
        let count = 0;
        $("#actCount").html(0);    	
        $.ajax({
                url:"/CGA103G1/getAllAct",
                data:"action=doPost",
                type:"POST",
                success:function (data) {
                      let output = "";
                      console.log(data);
                      count = Object.keys(data).length;
                      console.log(count);         
                      data.forEach(function(actVO){

                        if(actVO.act_status === 0){
                          actVO.act_status = "揪團中";                
                        }else if(actVO.act_status === 1){
                          actVO.act_status = "已成團";
                        };

                      output += `
                        <div class="row">
                          <div class="col-md-12 col-sm-12 col-xs-12">
                            <div class="row listroBox">
                              <div class="col-lg-5 col-md-5 col-sm-6 col-xs-12 Nopadding">
                                <figure> 
                                  <a href="activity-detailed-view.html" class="wishlist_bt"></a>
                                  <a href="activity-detailed-view.html">
                                    <img src="images/hotels/room6.jpg" class="img-fluid" alt="">
                                    <div class="read_more"><span>Read more</span></div>
                                    </a> 
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
                                    <div class="R_retings"><span>${actVO.act_loc}<em>${actVO.eval_sum} 評價總人數</em></span><strong>${actVO.act_rate_sum} 評價平均星數</strong></div>
                                  </li>
                                </ul>
                              </div>
                            </div>
                            </div>
                            </div>
                            `;                 
                        });
                    console.log(count);         
                    $("#actCount").html(data.length);    					
                    $("#actListDiv").html(output);            
                },
                dataType : "json"
              });
          });
        }

    // 2. radio

    // 3. radio




);
