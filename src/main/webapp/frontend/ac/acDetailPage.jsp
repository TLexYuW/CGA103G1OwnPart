<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>文章詳細頁</title>
	<%-- CSS --%>
	<%@ include file="/frontend/commonCSS.file" %>

</head>
<body>
	<%-- header --%>
	<%@ include file="/frontend/header.file" %>
	
	
	
	<section class="Blog-list pt80 pb80 blog-single-section">
  <div class="container">
    <div class="row">
      <div class="col-lg-8 col-md-12 col-xs-12">
        <div class="blog-content">
          <div class="post format-standard-image">
            <div class="entry-media"> <img src="images/blog/02.jpg"></div>
            <ul class="entry-meta">
              <li><a href="#"><i class="far fa-clock"></i>Feb 20, 2019</a></li>
              <li><a href="#"><i class="fas fa-funnel-dollar"></i>Consulting</a></li>
              <li><a href="#"><i class="fas fa-comments"></i>3</a></li>
            </ul>
            <h2>Comprehensive learning platform for serious consultants and skilled professionals who want to grow</h2>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip  It showed a lady fitted out with a fur hat and fur boa who sat upright, raising a heavy fur muff that covered the whole of her lower </p>
            <p>His many legs, pitifully thin compared with the size of the rest of him, waved about helplessly as he looked. "What's happened to me?" he thought. It wasn't a dream. His room, a proper human room although a little too small, lay peacefully between its four familiar walls. A collection of textile samples lay spread out on the table - Samsa was a travelling salesman - and above it there hung a picture that he had recently cut out of an illustrated magazine and housed in a nice, gilded frame. It showed a lady fitted out with a fur hat and fur boa who sat upright, raising a heavy fur muff that covered the whole of her lower arm towards the viewer. Gregor then turned to look out the window at the dull weather. Drops</p>
            <blockquote> Samples lay spread out on the table - Samsa was a travelling salesman - and above it there hung a picture that he had recently cut out of an illustrated magazine and housed in a nice, gilded frame. It showed a lady fitted out with a fur hat and fur boa who sat upright <span class="quoter">- Mic dow</span> </blockquote>
            <h3>Recently cut out of an illustrated magazine and housed in a nice, gilded frame. It showed a lady fitted out with a fur hat and fur boa </h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam </p>
          </div>
          <div class="tag-share">
            <div class="tag"> Tags: &nbsp;
              <ul>
                <li><a href="#">Business ,</a></li>
                <li><a href="#">Agency ,</a></li>
                <li><a href="#">Finance</a></li>
                <li><a href="#">Consutling ,</a></li>
              </ul>
            </div>
            <div class="share"> Share: &nbsp;
              <ul>
                <li><a target="_Blank" href="http://www.facebook.com"><i class="fab fa-facebook-f"></i></a></li>
                <li><a target="_Blank" href="http://www.twitter.com"><i class="fab fa-twitter"></i></a></li>
                <li><a target="_Blank" href="http://www.google.com"><i class="fab fa-google-plus-g"></i></a></li>
                <li><a target="_Blank" href="http://www.linkedin.com"><i class="fab fa-linkedin-in"></i></a></li>
                <li><a target="_Blank" href="http://www.instagram.com"><i class="fab fa-instagram"></i></a></li>
              </ul>
            </div>
          </div>
          <!-- end tag-share -->
          
          <div class="author-box">
            <div class="author-avatar"> <a href="#" target="_blank"><img src="images/author.jpg" alt=""></a> </div>
            <div class="author-content"> <a href="#" class="author-name">Mice dow</a>
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam</p>
              <div class="socials">
                <ul class="social-link">
                  <li><a href="#"><i class="ti-facebook"></i></a></li>
                  <li><a href="#"><i class="ti-twitter-alt"></i></a></li>
                  <li><a href="#"><i class="ti-linkedin"></i></a></li>
                  <li><a href="#"><i class="ti-instagram"></i></a></li>
                </ul>
              </div>
            </div>
          </div>
          <!-- end author-box -->
          
          <div class="more-posts">
            <div class="previous-post"> <a href="#"> <span class="post-control-link"><i class="ti-arrow-circle-left"> </i>Previous post</span> </a> </div>
            <div class="next-post"> <a href="0"> <span class="post-control-link">Next post <i class="ti-arrow-circle-right"></i></span> </a> </div>
          </div>
          <!-- end more-posts -->
          
          <div class="comments-area">
            <div class="comments-section">
              <h3 class="comments-title">Comments</h3>
              <ol class="comments">
                <li class="comment even thread-even depth-1" id="comment-1">
                  <div id="div-comment-1">
                    <div class="comment-theme">
                      <div class="comment-image"><img src="images/img-11.jpg" alt=""></div>
                    </div>
                    <div class="comment-main-area">
                      <div class="comment-wrapper">
                        <div class="comments-meta">
                          <h4>Jhon <span class="comments-date">says Oct 15, 2018 at 11:00</span></h4>
                        </div>
                        <div class="comment-area">
                          <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam</p>
                          <div class="comments-reply"> <a class="comment-reply-link" href="#"><span>Reply</span></a> </div>
                        </div>
                      </div>
                    </div>
                  </div>
                  <ul class="children">
                    <li class="comment">
                      <div>
                        <div class="comment-theme">
                          <div class="comment-image"><img src="images/img-22.jpg" alt=""></div>
                        </div>
                        <div class="comment-main-area">
                          <div class="comment-wrapper">
                            <div class="comments-meta">
                              <h4>Jhon <span class="comments-date">says Oct 15, 2018 at 11:00</span></h4>
                            </div>
                            <div class="comment-area">
                              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam</p>
                              <div class="comments-reply"> <a class="comment-reply-link" href="#"><span>Reply</span></a> </div>
                            </div>
                          </div>
                        </div>
                      </div>
                      <ul>
                        <li class="comment">
                          <div>
                            <div class="comment-theme">
                              <div class="comment-image"><img src="images/img-33.jpg" alt=""></div>
                            </div>
                            <div class="comment-main-area">
                              <div class="comment-wrapper">
                                <div class="comments-meta">
                                  <h4>Jhon <span class="comments-date">says Oct 15, 2018 at 11:00</span></h4>
                                </div>
                                <div class="comment-area">
                                  <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam</p>
                                  <div class="comments-reply"> <a class="comment-reply-link" href="#"><span>Reply</span></a> </div>
                                </div>
                              </div>
                            </div>
                          </div>
                        </li>
                      </ul>
                    </li>
                  </ul>
                </li>
                <li class="comment">
                  <div>
                    <div class="comment-theme">
                      <div class="comment-image"><img src="images/img-11.jpg" alt=""></div>
                    </div>
                    <div class="comment-main-area">
                      <div class="comment-wrapper">
                        <div class="comments-meta">
                          <h4>留言者姓名 <span class="comments-date"> 留言時間</span></h4>
                        </div>
                        <div class="comment-area">
                          <p>留言</p>
                        </div>
                      </div>
                    </div>
                  </div>
                </li>
              </ol>
            </div>
            <!-- end comments-section -->
            
            <div class="comment-respond">
              <h3 class="comment-reply-title">Post Comments</h3>
              <form method="post" id="commentform" class="comment-form">
                <div class="form-textarea">
                  <textarea id="comment" placeholder="Write Your Comments..."></textarea>
                </div>
                <div class="form-inputs">
                  <input placeholder="Website" type="url">
                  <input placeholder="Name" type="text">
                  <input placeholder="Email" type="email">
                </div>
                <div class="form-submit">
                  <input id="submit" value="Post Comment" type="submit">
                </div>
              </form>
            </div>
          </div>
          <!-- end comments-area --> 
        </div>
      </div>
      <div class="col-lg-4 col-md-12 col-xs-12">
<!--         <div class="blog-sidebar"> -->
<!--           <div class="widget search-widget"> -->
<!--             <h3>Search</h3> -->
<!--             <form> -->
<!--               <div> -->
<!--                 <input type="text" class="form-control" placeholder="Search Post.."> -->
<!--                 <button type="submit"><i class="ti-search"></i></button> -->
<!--               </div> -->
<!--             </form> -->
<!--           </div> -->
<!--           <div class="widget category-widget"> -->
<!--             <h3>Categories</h3> -->
<!--             <ul> -->
<!--               <li><a href="#">Business <span>(2)</span></a></li> -->
<!--               <li><a href="#">Corporate <span>(5)</span></a></li> -->
<!--               <li><a href="#">Market Research <span>(3)</span></a></li> -->
<!--               <li><a href="#">Financial Planning <span>(7)</span></a></li> -->
<!--               <li><a href="#">Consulting <span>(10)</span></a></li> -->
<!--             </ul> -->
<!--           </div> -->
<!--           <div class="widget recent-post-widget"> -->
<!--             <h3>Recent post</h3> -->
<!--             <div class="posts"> -->
<!--               <div class="post"> -->
<!--                 <div class="img-holder"> <img src="images/b1.jpg" alt=""> </div> -->
<!--                 <div class="details"> -->
<!--                   <h4><a href="#">Slightly domed and divided by arches</a></h4> -->
<!--                   <span class="date">Mar 19 2019</span> </div> -->
<!--               </div> -->
<!--               <div class="post"> -->
<!--                 <div class="img-holder"> <img src="images/b2.jpg" alt=""> </div> -->
<!--                 <div class="details"> -->
<!--                   <h4><a href="#">Collection of textile samples lay spread</a></h4> -->
<!--                   <span class="date">Mar 19 2019</span> </div> -->
<!--               </div> -->
<!--               <div class="post"> -->
<!--                 <div class="img-holder"> <img src="images/b3.jpg" alt=""> </div> -->
<!--                 <div class="details"> -->
<!--                   <h4><a href="#">Recently cut out of an illustrated magazine </a></h4> -->
<!--                   <span class="date">Mar 19 2019</span> </div> -->
<!--               </div> -->
<!--             </div> -->
<!--           </div> -->
<!--           <div class="widget tag-widget"> -->
<!--             <h3>Tags</h3> -->
<!--             <ul> -->
<!--               <li><a href="#">Consulting</a></li> -->
<!--               <li><a href="#">Analysis</a></li> -->
<!--               <li><a href="#">Business</a></li> -->
<!--               <li><a href="#">Research</a></li> -->
<!--               <li><a href="#">Corporate</a></li> -->
<!--             </ul> -->
<!--           </div> -->
<!--         </div> -->
      </div>
    </div>
  </div>
</section>
	
	
	
	
	
	
	
	<%-- footer --%>
	<%@ include file="/frontend/footer.file" %>
  	
  	<%-- commonJS --%>
	<%@ include file="/frontend/commonJS.file" %>
	
</body>
</html>