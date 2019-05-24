package com.example.trackrtc.frag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.example.trackrtc.R;


public class Search extends Fragment {
    public TextView noMatches;
    SwipeRefreshLayout mSwipeRefreshLayout;
    private RecyclerView recyclerView;

    public Search() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_search, container, false);
        recyclerView = v.findViewById(R.id.results);
//        serviceCall();
        return v;
    }

//    private void serviceCall() {
//        try {
//            Apis apis = RetrofirUtils.serviceGenerator().create(Apis.class);
//            Call<ArrayList<BusList>> userResponseCall = apis.getBusList();
//            userResponseCall.enqueue(new Callback<ArrayList<BusList>>() {
//                @SuppressLint("CheckResult")
//                @Override
//                public void onResponse(Call<ArrayList<BusList>> call, Response<ArrayList<BusList>> response) {
//                    if (response.body() != null) {
//                        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
//                        recyclerView.setLayoutManager(mLayoutManager);
//                        BusListAdapter matchesAdapter = new BusListAdapter(getActivity(), response.body());
//                        recyclerView.setAdapter(matchesAdapter);
//                    } else {
//                        Toasty.normal(Objects.requireNonNull(getContext()), "Something went wrong", 1);
//                    }
//                }
//
//                @Override
//                public void onFailure(Call<ArrayList<BusList>> call, Throwable t) {
//                    Log.e("error_call", t.getMessage());
//                }
//            });
//
//        } catch (Exception e) {
//            e.getMessage();
//        }
//    }
}
