package bex.training.core.simplepromo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.psddev.cms.view.ViewModel;
import com.psddev.styleguide.core.journey.YourJourneyModuleView;
import com.psddev.styleguide.core.journey.YourJourneyModuleViewMediaField;

public class YourJourneyModuleViewModel extends ViewModel<YourJourneyModule> implements YourJourneyModuleView {

    @Override
    public CharSequence getTitle() {
        return model.getTitle();
    }

    @Override
    public CharSequence getDescription() {
        return model.getDescription();
    }

    @Override
    public Iterable<? extends YourJourneyModuleViewMediaField> getMedia() {
        return createViews(YourJourneyModuleViewMediaField.class, model.getMedia());
    }

    @Override
    public CharSequence getEndDate() {

        if (model.getEndDate() != null) {
            String endDateFormat = "MM/dd/yyyy hh:mm:ss a";
            DateFormat df = new SimpleDateFormat(endDateFormat);
            return df.format(model.getEndDate());
        }

        return null;
    }
}
