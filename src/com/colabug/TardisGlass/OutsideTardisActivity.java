package com.colabug.TardisGlass;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class OutsideTardisActivity extends Activity
{
    @Override
    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.outside_tardis );

        View outsideImage = findViewById( R.id.outside_tardis_image );
        outsideImage.setOnClickListener( generateInsideTardisListener() );
    }

    private View.OnClickListener generateInsideTardisListener()
    {
        return new View.OnClickListener()
        {
            @Override
            public void onClick( View view )
            {
                showInsideOfTardis();
            }
        };
    }

    private void showInsideOfTardis()
    {
        startActivity( InsideTardisActivity.createIntent( OutsideTardisActivity.this ) );
    }
}
