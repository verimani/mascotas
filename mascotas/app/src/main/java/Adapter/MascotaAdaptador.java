package Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.veronicamachado.mascotas.R;

import java.util.ArrayList;

import Pojo.Mascotas;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotasViewHolder>{

    public MascotaAdaptador(ArrayList<Mascotas> mascotas){
        this.mascotas = mascotas;
    }

    ArrayList<Mascotas> mascotas;
    @NonNull
    @Override
    public MascotasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas,parent,false);
        return new MascotasViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotasViewHolder mascotasViewHolder, int position) {
        Mascotas mascota = mascotas.get(position);
        mascotasViewHolder.imgFotocv.setImageResource(mascota.getFotomas());
        mascotasViewHolder.tvNombremcv.setText(mascota.getNombre());
        /*mascotasViewHolder.tvLikes.setText(String.valueOf(mascota.getLikes()));*/

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotasViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFotocv;
        private TextView tvNombremcv;
        private ImageButton btnLike;
        private TextView tvLikes;

        public MascotasViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFotocv = (ImageView) itemView.findViewById(R.id.imgFotocv);
            tvNombremcv=(TextView) itemView.findViewById(R.id.tvNombrecv);
            btnLike = (ImageButton) itemView.findViewById(R.id.imghuesolike);
            tvLikes = (TextView) itemView.findViewById(R.id.tvLikescv);

        }
    }
}
