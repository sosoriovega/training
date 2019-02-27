package bex.training.swiftype;

import com.psddev.cms.view.ViewModel;
import com.psddev.styleguide.swifttype.SwiftTypeMetaView;

public class SwifTypeMetaViewModel extends ViewModel<SwifTypeMeta> implements SwiftTypeMetaView {

    @Override
    public Iterable<? extends CharSequence> getAuthor() {
        return model.getSwifTypeAuthors();
    }

    @Override
    public Iterable<? extends CharSequence> getCategory() {
        return null;
    }

    @Override
    public Iterable<? extends CharSequence> getTags() {
        return model.getSwifTypeTags();
    }

    @Override
    public CharSequence getTitle() {
        return model.getSwifTypeTitle();
    }
}
