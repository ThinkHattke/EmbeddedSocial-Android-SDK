/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *
 */

package com.microsoft.socialplus.ui.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBar;

import com.microsoft.socialplus.sdk.R;
import com.microsoft.socialplus.service.IntentExtras;
import com.microsoft.socialplus.ui.activity.base.BaseActivity;
import com.microsoft.socialplus.ui.fragment.ReportFragment;

/**
 * Activity for reporting content or user.
 */
public class ReportActivity extends BaseActivity {

	@Override
	protected void setupFragments() {
		final ReportFragment reportFragment = new ReportFragment();
		reportFragment.setArguments(getIntent().getExtras());
		setActivityContent(reportFragment);

	}

	@Override
	protected void setupActionBar(ActionBar actionBar) {
		super.setupActionBar(actionBar);
		Bundle extras = getIntent().getExtras();
		if (extras.containsKey(IntentExtras.NAME)) {
			String title = getString(R.string.sp_report_user, extras.getString(IntentExtras.NAME));
			actionBar.setTitle(title);
		}
	}

	@Override
	protected boolean isAuthorizationRequired() {
		return true;
	}

	@Override
	protected void initView(Bundle savedInstanceState) {
		super.initView(savedInstanceState);
		setNonNavDrawerToolbar();
	}
}