package com.example.ViewBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;

import com.danielstone.materialaboutlibrary.ConvenienceBuilder;
import com.danielstone.materialaboutlibrary.MaterialAboutActivity;
import com.danielstone.materialaboutlibrary.MaterialAboutFragment;
import com.danielstone.materialaboutlibrary.items.MaterialAboutActionItem;
import com.danielstone.materialaboutlibrary.items.MaterialAboutTitleItem;
import com.danielstone.materialaboutlibrary.model.MaterialAboutCard;
import com.danielstone.materialaboutlibrary.model.MaterialAboutList;
import com.danielstone.materialaboutlibrary.ConvenienceBuilder;
import com.danielstone.materialaboutlibrary.items.MaterialAboutActionItem;
import com.danielstone.materialaboutlibrary.items.MaterialAboutItemOnClickAction;
import com.danielstone.materialaboutlibrary.items.MaterialAboutTitleItem;
import com.danielstone.materialaboutlibrary.model.MaterialAboutCard;
import com.danielstone.materialaboutlibrary.model.MaterialAboutList;
import com.danielstone.materialaboutlibrary.util.OpenSourceLicense;

/**@author Antonio Salado
 * en esta clase se usara para la creacion del AboutUs mediante un tutorial de GitHub que hemos siguido en clase
 */
public class AboutUsActivity extends MaterialAboutActivity {

    public static final String TAG = "AboutUsActivity";


    /**
     * Metodo MaterialAboutList
     * @param context
     * @return
     * En este metodo se usara para crear las cartas del about que necesitamos
     */
    @Override
    @NonNull
    protected MaterialAboutList getMaterialAboutList(@NonNull Context context) {
        MaterialAboutCard.Builder IdentityCardBuilder = new MaterialAboutCard.Builder();
        IdentityCardBuilder.title("Autor");

        IdentityCardBuilder.cardColor(ContextCompat.getColor(context, R.color.blue));
        IdentityCardBuilder.addItem(new MaterialAboutActionItem.Builder()
                .text("Antonio Angel Salado Gomez")
                .subText("Alumno, modulo DEINT")
                .icon(R.drawable.ic_person)
                .build());
        IdentityCardBuilder.addItem(new MaterialAboutTitleItem.Builder()
                .desc("Fork on Github")
                .icon(R.drawable.ic_share)
                .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(context, Uri.parse("https://github.com/asalgom/SendMessageViewBinding")))
                .build());
        MaterialAboutCard.Builder VersionCardBuilder = new MaterialAboutCard.Builder();
        VersionCardBuilder.cardColor(ContextCompat.getColor(context, R.color. blue));

        VersionCardBuilder.addItem(new MaterialAboutActionItem.Builder()
                .text("Version")
                .subText("1.0.0")
                .icon(R.drawable.ic_info)
                .build());
        return new MaterialAboutList.Builder()
                .addCard(IdentityCardBuilder.build())
                .addCard(VersionCardBuilder.build())
                .build();
    }

    @Override
    protected CharSequence getActivityTitle() {
        return getString(R.string.mal_title_about);
    }


}