package com.macbitsgoa.events.eateries;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.card.MaterialCardView;
import com.macbitsgoa.events.R;
import com.macbitsgoa.events.home.HomeCardInterface;

import androidx.fragment.app.Fragment;

/**
 * The fragment for feature eateries to be shown on home screen
 * {@link com.macbitsgoa.events.home.HomeActivity}.
 */
public class EateriesCardFragment extends Fragment
        implements HomeCardInterface {

    @Override
    public View onCreateView(final LayoutInflater inflater,
                             final ViewGroup container, final Bundle savedInstanceState) {
        final MaterialCardView selfCard =
                (MaterialCardView) inflater.inflate(R.layout.fragment_eateries_card,
                        container, false);
        selfCard.setOnClickListener(view ->
                startActivity(new Intent(view.getContext(), EateriesActivity.class)));
        return selfCard;
    }
}
