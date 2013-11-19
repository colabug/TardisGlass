package com.colabug.TardisGlass;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class InsideTardisActivity extends Activity
{
    @Override
    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.inside_tardis );
    }

    public static Intent createIntent( Context context )
    {
        return new Intent( context, InsideTardisActivity.class );
    }
}
