package mx.edu.tesoem.isc.meta.p2p2meta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
List<String> ListaEstado;
String[] strEstado;
Spinner objSpiner;
ArrayAdapter<String>ListEstados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        objSpiner=findViewById(R.id.cargalista);
        strEstado=new String[]{"Nuevo Leon", "Aguascalientes",
    "Baja California Norte", "Baja California Sur",
    "Campeche", "Coahuila",
    "Colima", "Cd Mx",
    "Durango", "Veracurz",
    "Tamaulipas", "Hidalgo",
    "Queretaro", "Puebla",
    "Chiapas", "Yucatan",
    "Guanajuato", "Quintana Roo",
    "Michoacan", "Chihuahua",
    "Oaxaca", "Jalisco",
    "Sonora", "Tlaxcala",
    "Estado de Mexico", "Sinaloa",
    "Nayarit", "Tabasco",
    "SanLuis Potosi", "Morelos",
    "Zacatecas", "Guerrero"};
        ListaEstado= new ArrayList<String>();
        Collections.addAll(ListaEstado,strEstado);
        ListEstados=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,ListaEstado);
        objSpiner.setAdapter(ListEstados);
    }
}
