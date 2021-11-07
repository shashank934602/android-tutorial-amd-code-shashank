package com.codewithshashank.implicetintents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.codewithshashank.implicetintents.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {
    Button button;
    EditText URl;


    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

       view.findViewById(R.id.open).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
       button = view.findViewById(R.id.button);
       URl = view.findViewById(R.id.URl);
       button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URLText = URl.getText().toString();
                Toast.makeText(getActivity(), URLText, Toast.LENGTH_SHORT).show();
                // implecet Intent to open a webpage
//                Uri webpage = Uri.parse(URLText);
//                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
//                if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
//                    startActivity(intent);
//                }
                // implece intent to open an email sending app
                String [] addresses = {"vavilala.shashan100@gmail.com", "Anonymus@codewithharry.com"};
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("*/*");
                intent.putExtra(Intent.EXTRA_EMAIL, addresses);
                intent.putExtra(Intent.EXTRA_SUBJECT, "Harry subject");
                intent.putExtra(Intent.EXTRA_TEXT, URLText);

//                intent.putExtra(Intent.EXTRA_STREAM, attachment);
                if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(intent);

            }
            }
        });
    }


}