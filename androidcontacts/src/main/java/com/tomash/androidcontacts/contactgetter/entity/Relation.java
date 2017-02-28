package com.tomash.androidcontacts.contactgetter.entity;

import android.content.Context;
import android.provider.ContactsContract;

import com.tomash.androidcontacts.contactgetter.interfaces.WithLabel;

/**
 * Created by andrew on 2/24/17.
 */

public class Relation extends WithLabel {


    public Relation(String mainData, int contactId, int labelId, String labelName, Context ctx) {
        super(mainData, contactId, labelId, labelName, ctx);
    }

    @Override
    public String getLabelNameResId(Context ctx,int id) {
        return ctx.getString(ContactsContract.CommonDataKinds.Relation.getTypeLabelResource(id));
    }

    public Relation() {
    }
}
