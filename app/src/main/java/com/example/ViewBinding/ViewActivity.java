package com.example.ViewBinding;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ViewBinding.data.Message;
import com.example.ViewBinding.data.Person;
import com.example.ViewBinding.databinding.ActivityViewBinding;

/**@author Antonio Salado
 * Aqui se mostrara el mensaje enviado por el remitente en SendMessageActivity que se mostrara tambien sus datos personales
 */
public class ViewActivity extends AppCompatActivity {

   // private TextView TvUserInfo;
   //  private TextView TvMessage;

    private ActivityViewBinding binding;
    private Message message;
    private Person person;
    private Person person2;
    private static final String TAG = "ViewActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

       // TvUserInfo = findViewById(R.id.TvUserInfo);
        //TvMessage = findViewById(R.id.TvMessage);

        Bundle bundle = getIntent().getExtras();
        message = (Message) bundle.getSerializable("Message");
        if (message != null) {
            person = message.getAddressee();
            person2 = message.getSender();
            String userInfo = "Nombre: " + person.getName() + "\n" +
                    "Apellidos: " + person.getSudName() + "\n" +
                    "NIF: " + person.getNif();
            binding.TvUserInfo.setText(userInfo);
            String messageText = "Mensaje: " + message.getContenido() + "  | Enviando por " + person.getName() + " para " + person2.getName();
            binding.TvMessage.setText(messageText);
        } else {
            message = new Message();
            person = new Person();
            person2 = new Person();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.AboutUs)
        {
            Intent intent = new Intent(ViewActivity.this, AboutUsActivity.class);
            startActivity(intent);
        }
        return true;
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        binding = null;
    }

}


