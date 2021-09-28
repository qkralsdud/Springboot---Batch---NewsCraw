package com.cos.newscraw.batch;

import java.util.List;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.cos.newscraw.domain.News;
import com.cos.newscraw.domain.NewsRepository;
import com.cos.newscraw.util.NewsCraw;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class NewsBatch {
	private final NewsRepository newsRepository;
	private final NewsCraw newsCraw;
	
	@Scheduled(fixedDelay = 1000*60*1)
	public void newsCrawSave() {
		
		List<News> newsList = newsCraw.collect5();		
		newsRepository.saveAll(newsList);
	}
}
