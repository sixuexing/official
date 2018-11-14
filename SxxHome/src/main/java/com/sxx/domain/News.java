package com.sxx.domain;

import java.util.Date;

public class News extends BaseDomain {
		//新闻标题
		private String title;
		//新闻内容
		private String context;
		//新闻图片路径
		private String imgUrl;
		//新闻录入时间
		private Date inputDate= new Date();
		//浏览次数(热点新闻)
		private Integer viewCount;
		//是否推荐新闻
		private Boolean isRecommend;
		//新闻类型
		private NewsType type; 
		//新闻录入人(自动生成,从HttpSession获取登录用户的信息)
		private User user;
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getContext() {
			return context;
		}
		public void setContext(String context) {
			this.context = context;
		}
		public String getImgUrl() {
			return imgUrl;
		}
		public void setImgUrl(String imgUrl) {
			this.imgUrl = imgUrl;
		}
		public Date getInputDate() {
			return inputDate;
		}
		public void setInputDate(Date inputDate) {
			this.inputDate = inputDate;
		}
		public Integer getViewCount() {
			return viewCount;
		}
		public void setViewCount(Integer viewCount) {
			this.viewCount = viewCount;
		}
		public Boolean getIsRecommend() {
			return isRecommend;
		}
		public void setIsRecommend(Boolean isRecommend) {
			this.isRecommend = isRecommend;
		}
		public NewsType getType() {
			return type;
		}
		public void setType(NewsType type) {
			this.type = type;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public News() {
			super();
		}
		public News(Long id, String title, String context, String imgUrl, Date inputDate, Integer viewCount,
				Boolean isRecommend, NewsType type, User user) {
			super();
			this.title = title;
			this.context = context;
			this.imgUrl = imgUrl;
			this.inputDate = inputDate;
			this.viewCount = viewCount;
			this.isRecommend = isRecommend;
			this.type = type;
			this.user = user;
		}
		@Override
		public String toString() {
			return "News [title=" + title + ", context=" + context + ", imgUrl=" + imgUrl
					+ ", inputDate=" + inputDate + ", viewCount=" + viewCount + ", isRecommend=" + isRecommend
					+ ", type=" + type + ", user=" + user + "]";
		}
		
}
