package com.mojitoproject.testyhindusow;

import android.content.Context;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;

public class Popup extends PopupWindow {

    Context context;
    EditText et_name, et_number;
    String name, number;

    private int dx;
    private int dy;
    private OnSubmitListener mListener;


    public Popup(Context ctx, OnSubmitListener listener) {
        super(ctx);

        context = ctx;
        mListener = listener;

        setContentView(LayoutInflater.from(context).inflate(R.layout.popup, null));
        setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        setWidth(WindowManager.LayoutParams.WRAP_CONTENT);
        View popupView = getContentView();
        setFocusable(true);

        Button btn_close = (Button) popupView.findViewById(R.id.popupClose);
        Button btn_submit = (Button) popupView.findViewById(R.id.popupSave);
        et_name = (EditText) popupView.findViewById(R.id.bank_name);
        et_number = (EditText) popupView.findViewById(R.id.bankacc_no);

        btn_submit.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                String name = et_name.getText().toString();
                String number = et_number.getText().toString();

                mListener.valueChanged(name, number);//To change the value of the textview of activity.
                dismiss();
            }
        });

        btn_close.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {
                dismiss();
            }
        });

// setOnTouchListener is to add drag and drop the popup window.
// If you didn't want, you can remove it.
        popupView.setOnTouchListener(new OnTouchListener() {

            public boolean onTouch(View arg0, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {

                    case MotionEvent.ACTION_DOWN:
                        dx = (int) motionEvent.getRawX();
                        dy = (int) motionEvent.getRawY();
                        break;

                    case MotionEvent.ACTION_MOVE:
                        int x = (int) motionEvent.getRawX();
                        int y = (int) motionEvent.getRawY();
                        int left = (x - dx);
                        int top = (y - dy);
                        update(left, top, -1, -1);
                        break;
                }
                return true;
            }
        });
    }

    public void show(View v) {
        showAtLocation(v, Gravity.CENTER, 0, 0);
        Log.e("JAJA", "moje");
    }

    public interface OnSubmitListener {
        void valueChanged(String name, String number);
    }
}