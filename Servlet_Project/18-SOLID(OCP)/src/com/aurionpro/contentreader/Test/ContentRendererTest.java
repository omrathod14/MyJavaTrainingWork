package com.aurionpro.contentreader.Test;

import com.aurionpro.contentreader.model.ArticleContent;
import com.aurionpro.contentreader.model.Content;
import com.aurionpro.contentreader.model.ContentRenderer;
import com.aurionpro.contentreader.model.PodcastContent;
import com.aurionpro.contentreader.model.QuizContent;
import com.aurionpro.contentreader.model.VideoContent;

public class ContentRendererTest {
	public static void main(String[] args) {
		ContentRenderer renderer = new ContentRenderer();

		Content video = new VideoContent();
		Content article = new ArticleContent();
		Content quiz = new QuizContent();
		Content podcast = new PodcastContent();

		renderer.renderContent(video);
		renderer.renderContent(article);
		renderer.renderContent(quiz);
		renderer.renderContent(podcast);
	}
}
