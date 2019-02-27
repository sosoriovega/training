package bex.training.core.article;

import brightspot.core.article.Article;
import com.psddev.dari.db.Modification;

public class ArticleModification extends Modification<Article> {

    private String newField;

    public String getNewField() {
        return newField;
    }

    public void setNewField(String newField) {
        this.newField = newField;
    }
}
