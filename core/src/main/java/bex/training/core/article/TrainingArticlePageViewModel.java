package bex.training.core.article;

import bex.training.swiftype.SwifTypeMeta;
import brightspot.core.article.ArticlePageViewModel;
import com.psddev.styleguide.core.article.ArticlePageView;
import com.psddev.styleguide.core.page.PageViewMetaField;
import com.psddev.styleguide.core.page.SeoRobotsMetaView;
import com.psddev.styleguide.facebook.FacebookMetasView;
import com.psddev.styleguide.facebook.OpenGraphMetaView;
import com.psddev.styleguide.swifttype.SwiftTypeMetaView;
import com.psddev.styleguide.twitter.card.TwitterSummaryLargeImageCardView;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TrainingArticlePageViewModel extends ArticlePageViewModel implements ArticlePageView {

    @Override
    public CharSequence getNewField() {
        return model.as(ArticleModification.class).getNewField();
    }

    @Override
    public Iterable<? extends PageViewMetaField> getMeta() {
        return getMetaTags();
    }

    public Iterable<PageViewMetaField> getMetaTags() {
        return Stream.of(
                createView(SeoRobotsMetaView.class, model),
                createView(OpenGraphMetaView.class, model),
                createView(TwitterSummaryLargeImageCardView.class, model),
                createView(FacebookMetasView.class, model),
                createView(SwiftTypeMetaView.class, model.as(SwifTypeMeta.class)))
                .collect(Collectors.toList());
    }
}
