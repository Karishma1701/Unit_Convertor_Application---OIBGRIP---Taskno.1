package com.example.unitconverter;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.Arrays;

public class weight_cal extends AppCompatActivity {

    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = "Kilogram";
    String toUnit = "Kilogram";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "Kilogram",
            "Gram",
            "Exa Gram",
            "Peta Gram",
            "Tera Gram", "Giga Gram"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_cal);

        cv_fromUnit = findViewById(R.id.fromUnit);
        cv_toUnit = findViewById(R.id.toUnit);
        cv_convert = findViewById(R.id.cv_convert);

        mCLayout = findViewById(R.id.temp_relativeLayout);

        tv_fromUnit = findViewById(R.id.tv_fromUnit);
        tv_toUnit = findViewById(R.id.tv_toUnit);

        tv_fromUnit.setText(values[0]);
        tv_toUnit.setText(values[0]);

        et_fromUnit = findViewById(R.id.et_fromUnit);
        et_toUnit = findViewById(R.id.et_toUnit);

        cv_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempInput = et_fromUnit.getText().toString();
                if (tempInput.equals("") || tempInput == null) {
                    et_fromUnit.setError("Please enter some value");
                } else {
                    if (tv_fromUnit.getText().toString().equals(values[0])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(kilogramToGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(kilogramToExaGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(kilogramToPetaGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(kilogramToTeraGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(kilogramToGigaGram(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(gramToKiloGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(gramToExaGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(gramToPetaGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(gramToTeraGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(gramToGigaGram(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(exaGramToKiloGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(exaGramToGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(exaGramToPetaGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(exaGramToTeraGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(exaGramToGigaGram(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(petaGramToKiloGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(petaGramToExaGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(petaGramToExaGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(petaGramToTeraGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(petaGramToGigaGram(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(teraGramToKiloGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(teraGramToGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(teraGramToExaGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(teraGramToPetaGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(teraGramToGigaGram(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(gigaGramToKiloGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(gigaGramToGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(gigaGramToExaGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(gigaGramToPetaGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(gigaGramToTeraGram(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(tempInput);
                        }
                    }
                }
            }
        });


        cv_toUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(weight_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Kilogram",
                        "Gram",
                        "Exa Gram",
                        "Peta Gram",
                        "Tera Gram", "Giga Gram"
                };

                builder.setSingleChoiceItems(
                        flowers, // Items list
                        -1, // Index of checked item (-1 = no selection)
                        new DialogInterface.OnClickListener() // Item click listener
                        {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // Get the alert dialog selected item's text
                                String selectedItem = Arrays.asList(flowers).get(i);
                                toUnit = selectedItem;
                                tv_toUnit.setText(toUnit);

                            }
                        });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // Just dismiss the alert dialog after selection
                        // Or do something now
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();

                // Finally, display the alert dialog
                dialog.show();

            }
        });

        cv_fromUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(weight_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Kilogram",
                        "Gram",
                        "Exa Gram",
                        "Peta Gram",
                        "Tera Gram", "Giga Gram"
                };

                builder.setSingleChoiceItems(
                        flowers, // Items list
                        -1, // Index of checked item (-1 = no selection)
                        new DialogInterface.OnClickListener() // Item click listener
                        {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // Get the alert dialog selected item's text
                                String selectedItem = Arrays.asList(flowers).get(i);
                                fromUnit = selectedItem;
                                tv_fromUnit.setText(fromUnit);

                            }
                        });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // Just dismiss the alert dialog after selection
                        // Or do something now
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();

                // Finally, display the alert dialog
                dialog.show();

            }
        });
    }

    //Kilogram
    private String kilogramToGram(double kilogram) {
        double gram = kilogram * 1000;
        return String.valueOf(gram);
    }

    private String kilogramToExaGram(double kilogram) {
        double exaGram = kilogram * 1.0E-15;
        return String.valueOf(exaGram);
    }

    private String kilogramToPetaGram(double kilogram) {
        double petaGram = kilogram * 1.0E-12;
        return String.valueOf(petaGram);
    }

    private String kilogramToTeraGram(double kilogram) {
        double teraGram = kilogram * 1.0E-9;
        return String.valueOf(teraGram);
    }

    private String kilogramToGigaGram(double kilogram) {
        double gigaGram = kilogram / 1000000;
        return String.valueOf(gigaGram);
    }

    //Gram
    private String gramToExaGram(double gram) {
        double exaGram = gram * 1.0E-18;
        return String.valueOf(exaGram);
    }

    private String gramToPetaGram(double gram) {
        double petaGram = gram * 1.0E-15;
        return String.valueOf(petaGram);
    }

    private String gramToTeraGram(double gram) {
        double teraGram = gram * 1.0E-12;
        return String.valueOf(teraGram);
    }

    private String gramToGigaGram(double gram) {
        double gigaGram = gram * 1.0E-9;
        return String.valueOf(gigaGram);
    }

    private String gramToKiloGram(double gram) {
        double kiloGram = gram * 0.001;
        return String.valueOf(kiloGram);
    }

    //Exa Gram
    private String exaGramToPetaGram(double exaGram) {
        double petaGram = exaGram * 1000;
        return String.valueOf(petaGram);
    }

    private String exaGramToTeraGram(double exaGram) {
        double teraGram = exaGram * 1000000;
        return String.valueOf(teraGram);
    }

    private String exaGramToGigaGram(double exaGram) {
        double gigaGram = exaGram * 1e+9;
        return String.valueOf(gigaGram);
    }

    private String exaGramToKiloGram(double exaGram) {
        double kiloGram = exaGram * 1.0E+15;
        return String.valueOf(kiloGram);
    }

    private String exaGramToGram(double exaGram) {
        double gram = exaGram * 1.0E+18;
        return String.valueOf(gram);
    }

    //Peta Gram
    private String petaGramToTeraGram(double petaGram) {
        double teraGram = petaGram * 1000;
        return String.valueOf(teraGram);
    }

    private String petaGramToGigaGram(double petaGram) {
        double gigaGram = petaGram * 1e+6;
        return String.valueOf(gigaGram);
    }

    private String petaGramToKiloGram(double petaGram) {
        double kiloGram = petaGram * 1e+12;
        return String.valueOf(kiloGram);
    }

    private String petaGramToGram(double petaGram) {
        double Gram = petaGram * 1e+15;
        return String.valueOf(Gram);
    }

    private String petaGramToExaGram(double petaGram) {
        double exaGram = petaGram / 1000;
        return String.valueOf(exaGram);
    }

    //Tera Gram
    private String teraGramToGigaGram(double teraGram) {
        double gigaGram = teraGram * 1000;
        return String.valueOf(gigaGram);
    }

    private String teraGramToKiloGram(double teraGram) {
        double kiloGram = teraGram * 1e+9;
        return String.valueOf(kiloGram);
    }

    private String teraGramToGram(double teraGram) {
        double Gram = teraGram * 1e+12;
        return String.valueOf(Gram);
    }

    private String teraGramToExaGram(double teraGram) {
        double exaGram = teraGram / 1e+6;
        return String.valueOf(exaGram);
    }

    private String teraGramToPetaGram(double teraGram) {
        double petaGram = teraGram / 1000;
        return String.valueOf(petaGram);
    }

    //Giga Gram
    private String gigaGramToKiloGram(double gigaGram) {
        double kiloGram = gigaGram * 1e+6;
        return String.valueOf(kiloGram);
    }

    private String gigaGramToGram(double gigaGram) {
        double Gram = gigaGram * 1e+9;
        return String.valueOf(Gram);
    }

    private String gigaGramToExaGram(double gigaGram) {
        double exaGram = gigaGram / 1e+9;
        return String.valueOf(exaGram);
    }

    private String gigaGramToPetaGram(double gigaGram) {
        double petaGram = gigaGram / 1e+6;
        return String.valueOf(petaGram);
    }

    private String gigaGramToTeraGram(double gigaGram) {
        double teraGram = gigaGram / 1000;
        return String.valueOf(teraGram);
    }

}