package com.bbk.satellitereceiverremotecontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.ConsumerIrManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnOnOff;
    Button btnUp, btnDown, btnRight, btnLeft, btnOk;
    Button btnZero, btnOne, btnTwo, btnThree, btnFour;
    Button btnFive, btnSix, btnSeven, btnEight, btnNine;
    Button btnExit, btnRecall, btnMute, btnMenu;
    Button btnRed, btnGreen, btnYellow, btnBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConsumerIrManager irManager = (ConsumerIrManager) getSystemService(CONSUMER_IR_SERVICE);

        if (irManager.hasIrEmitter()) {
            findViewById(R.id.tvUnavailable).setVisibility(View.GONE);
        } else {
            findViewById(R.id.svMainLayout).setVisibility(View.GONE);
        }

        btnOnOff = findViewById(R.id.btnOnOff);
        btnUp = findViewById(R.id.btnUp);
        btnDown = findViewById(R.id.btnDown);
        btnRight = findViewById(R.id.btnRight);
        btnLeft = findViewById(R.id.btnLeft);
        btnOk = findViewById(R.id.btnOk);
        btnZero = findViewById(R.id.btnZero);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnExit = findViewById(R.id.btnExit);
        btnRecall = findViewById(R.id.btnRecall);
        btnMute = findViewById(R.id.btnMute);
        btnMenu = findViewById(R.id.btnMenu);
        btnRed = findViewById(R.id.btnRed);
        btnGreen = findViewById(R.id.btnGreen);
        btnYellow = findViewById(R.id.btnYellow);
        btnBlue = findViewById(R.id.btnBlue);

        btnOnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irManager.transmit(33000, ButtonCodes.onOff);
            }
        });

        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irManager.transmit(33000, ButtonCodes.up);
            }
        });

        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irManager.transmit(33000, ButtonCodes.down);
            }
        });

        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irManager.transmit(33000, ButtonCodes.right);
            }
        });

        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irManager.transmit(33000, ButtonCodes.left);
            }
        });

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irManager.transmit(33000, ButtonCodes.ok);
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irManager.transmit(33000, ButtonCodes.zero);
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irManager.transmit(33000, ButtonCodes.one);
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irManager.transmit(33000, ButtonCodes.two);
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irManager.transmit(33000, ButtonCodes.three);
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irManager.transmit(33000, ButtonCodes.four);
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irManager.transmit(33000, ButtonCodes.five);
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irManager.transmit(33000, ButtonCodes.six);
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irManager.transmit(33000, ButtonCodes.seven);
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irManager.transmit(33000, ButtonCodes.eight);
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irManager.transmit(33000, ButtonCodes.nine);
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irManager.transmit(33000, ButtonCodes.exit);
            }
        });

        btnRecall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irManager.transmit(33000, ButtonCodes.recall);
            }
        });

        btnMute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irManager.transmit(33000, ButtonCodes.mute);
            }
        });

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irManager.transmit(33000, ButtonCodes.menu);
            }
        });

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irManager.transmit(33000, ButtonCodes.red);
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irManager.transmit(33000, ButtonCodes.green);
            }
        });

        btnYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irManager.transmit(33000, ButtonCodes.yellow);
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irManager.transmit(33000, ButtonCodes.blue);
            }
        });
    }
}