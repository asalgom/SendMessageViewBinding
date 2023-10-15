package com.example.ViewBinding;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.ViewBinding.data.Message;
import com.example.ViewBinding.data.Person;
import com.example.ViewBinding.databinding.ActivitySendMessageBinding;

/**@author Antonio Salado
 * En este ejercicio se vera como escribir un mensaje y luego mediante un boton enviarlo a otra actividad con un intent explicito y
 * aqui se podra acceder al about us con un boton, en el ViewBinding tambien se podra acceder al about us
 */
public class SendMessageActivity extends AppCompatActivity {


    // creo la instancia de listaner o delegado y hago el setter


    private ActivitySendMessageBinding binding;
    private Message message;
    private static final String TAG = "SendMessageActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySendMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        message = new Message();
        Log.d(TAG, "onCreate");


        // opcion 2 clase anonima es de tipo anonima con el binding
        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {// en el parametro recoge el botton...doucastingç
                Toast.makeText(SendMessageActivity.this, "Se ha pulsado en el boton enviar con la opcion 2", Toast.LENGTH_SHORT).show();
                SendMessage();
            }
        });


        // expresion lamba opcion 3

        // fab.setOnClickListener(view -> Toast.makeText(SendMessageActivity.this, "Se ha pulsado en el boton enviar con la opcion 3 "+fab.getId(), Toast.LENGTH_SHORT).show());

    }

    /**
     * Metodo OnCreateOptionsMenu
     * @param menu
     * @return
     * Ponemos este metodo para cargar un menú de opciones en la barra en el ActionBar de la actividad.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    /**
     * Metodo onOptionsItemSelected
     * @param item
     * @return
     * Ponemos este metodo para manejar la selección de elementos mediante un menú de opciones en la ActionBar
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.AboutUs)
        {
            Intent intent = new Intent(SendMessageActivity.this, AboutUsActivity.class);
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
    }



    /**
     * metodo que construye el mensaje y lo envia
     */
    public void SendMessage() {
        Intent intent = new Intent(SendMessageActivity.this, ViewActivity.class);
        Bundle bundle = new Bundle();

        Person person = new Person("Antonio", "Salado", "77666100E");
        Person person2 = new Person("Pepe", "Sanchez", "344553450E");

        message = new Message(4, binding.edMessage.getText().toString(), person, person2);

        /*bundle.putParcelable("Person", person);
        bundle.putParcelable("Person2", person2);*/

        // opcion1
        bundle.putSerializable("Message", message);
        //opcion 2
        //bundle.putParcelable((String) Message.KEY, (Parcelable) message);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    /*
    opcion 1 se cree a una clase que instancia la interfaz viewonclicklistener
     */
    class SendMessageOnClickListener implements View.OnClickListener {//escuchar eventos de onclicklistener

        @Override
        public void onClick(View view) {
            Toast.makeText(SendMessageActivity.this, "Se ha pulsado en el boton enviar", Toast.LENGTH_SHORT).show();
        }
    }


}