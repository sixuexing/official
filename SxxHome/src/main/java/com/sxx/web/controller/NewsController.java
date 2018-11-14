package com.sxx.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sxx.domain.News;
import com.sxx.service.INewsService;
import com.sxx.utils.AjaxResult;

@Controller
@RequestMapping("/news")
public class NewsController {
	@Autowired
	private INewsService newsService;
	
	@RequestMapping("/findAllNews")
	@ResponseBody
	public List<News> findAllNews(HttpServletRequest request,HttpServletResponse response){
		return newsService.getAll();
	}
	@RequestMapping("/saveNews")
	@ResponseBody
	public AjaxResult saveNews(News news) {
		System.out.println("保存新闻");
		try {
			if (null != news) {
				newsService.save(news);
			}
			return new AjaxResult();
		} catch (Exception e) {
			new AjaxResult("添加内容失败");
		}
		return new AjaxResult("添加失败，请联系管理员");
	}
}
