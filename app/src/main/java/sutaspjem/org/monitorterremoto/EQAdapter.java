package sutaspjem.org.monitorterremoto;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import sutaspjem.org.monitorterremoto.databinding.EqListItemBinding;

public class EQAdapter extends ListAdapter<EarthQuake,EQAdapter.EQViewHolder> {
    public static final DiffUtil.ItemCallback<EarthQuake> DIFF_CALLBACK=
            new DiffUtil.ItemCallback<EarthQuake>() {
                @Override
                public boolean areItemsTheSame(@NonNull EarthQuake oldItem, @NonNull EarthQuake newItem) {
                    return oldItem.getId().equals(newItem.getId());
                }
                @Override
                public boolean areContentsTheSame(@NonNull EarthQuake oldItem, @NonNull EarthQuake newItem) {
                    return oldItem.equals(newItem);
                }
            };
    protected EQAdapter() {
        super(DIFF_CALLBACK);
    }

    @NonNull
    @Override
    public EQAdapter.EQViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        EqListItemBinding binding =EqListItemBinding.inflate(LayoutInflater.from(parent.getContext()));
        /*View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.eq_list_item,parent,false);*/

        return new EQViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull EQAdapter.EQViewHolder holder, int position) {
        EarthQuake earthquake =getItem(position);
        holder.bind(earthquake);
    }
    class EQViewHolder extends RecyclerView.ViewHolder{
        private final EqListItemBinding binding;
        public EQViewHolder(@NonNull EqListItemBinding binding) {
            super(binding.getRoot());
            this.binding =binding;

        }
        public void bind(EarthQuake earthquake){
            binding.magnitudeText.setText(String.valueOf(earthquake.getMagnitud()));
            binding.placeText.setText(earthquake.getPlaces());

            binding.executePendingBindings();
        }

    }
}
