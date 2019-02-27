package bex.training.swiftype;

import com.psddev.dari.db.Recordable;

import java.util.List;

public interface SwifTypeMeta extends Recordable {

    String getSwifTypeTitle();

    List<String> getSwifTypeCategories();

    List<String> getSwifTypeAuthors();

    List<String> getSwifTypeTags();
}
