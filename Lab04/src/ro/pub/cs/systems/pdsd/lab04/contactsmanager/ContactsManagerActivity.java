package ro.pub.cs.systems.pdsd.lab04.contactsmanager;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;


public class ContactsManagerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_manager);
        final Button additional = (Button)findViewById(R.id.additional);
        final Button save = (Button)findViewById(R.id.save);
        final Button cancel = (Button)findViewById(R.id.cancel);
        
        additional.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				LinearLayout downLayout = (LinearLayout)findViewById(R.id.extraInfo);
				String additionalText = additional.getText().toString();
				
				if(additionalText.equals("Show Additional Fields")) {
					downLayout.setVisibility(View.VISIBLE);
				} else {
//					additional.setText("Hide Additional Fields");
					downLayout.setVisibility(View.GONE);
				}
			}
		});
        
        save.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
//				EditText phone = (EditText)findViewById(R.id.phone);
//				Intent intent = new Intent(TELEFON.Intents.Insert.ACTION);
//				intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);
//				if (phone != null) {
//				  intent.putExtra(ContactsContract.Intents.Insert.PHONE, phone);
//				}
//				startActivity(intent);
			}
		});
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.contacts_manager, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
