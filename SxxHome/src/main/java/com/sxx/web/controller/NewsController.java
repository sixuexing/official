package com.sxx.web.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public List<News> findAllNews(){
		return newsService.getAll();
	}
	@RequestMapping("/saveNews")
	@ResponseBody
	public AjaxResult saveNews(News news) {
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
	@RequestMapping("/deleteNews")
	@ResponseBody
	public AjaxResult deleteNews(@RequestParam(value = "ids") long[] ids) {
		if(null != ids) {
			for (long lid : ids) {
				newsService.delete(lid);
			}
			return new AjaxResult();
		}
		return new AjaxResult("删除失败，请联系管理员");
	}
	
	
	
	
	
	
	
	
}
