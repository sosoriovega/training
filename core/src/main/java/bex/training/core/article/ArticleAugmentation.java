package bex.training.core.article;

import bex.training.swiftype.SwifTypeMeta;
import brightspot.core.article.Article;
import brightspot.core.person.Author;
import brightspot.core.tag.Tag;
import com.psddev.dari.db.Augmentation;

import java.util.List;
import java.util.stream.Collectors;

public class ArticleAugmentation extends Augmentation<Article> implements SwifTypeMeta {
    @Override
    public String getSwifTypeTitle() {
        return getOriginalObject().getHeadline();
    }

    @Override
    public List<String> getSwifTypeCategories() {
        return null;
    }

    @Override
    public List<String> getSwifTypeAuthors() {
        return getOriginalObject().asAuthorableData().getAuthors()
                .stream()
                .map(Author::getName)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getSwifTypeTags() {
        return getOriginalObject().asTaggableData().getTags()
                .stream()
                .map(Tag::getDisplayName)
                .collect(Collectors.toList());
    }
}
