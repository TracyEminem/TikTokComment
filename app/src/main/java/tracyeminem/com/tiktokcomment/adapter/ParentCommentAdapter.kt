package tracyeminem.com.peipei.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import me.drakeet.multitype.ItemViewBinder
import tracyeminem.com.peipei.model.ParentComment
import tracyeminem.com.tiktokcomment.R

/**
 * Created by TracyEminem on 2019/7/12 下午4:21.
 */
class ParentCommentAdapter : ItemViewBinder<ParentComment,ParentCommentAdapter.ViewHolder>(){
    override fun onBindViewHolder(holder: ViewHolder, item: ParentComment) {
    }

    override fun onCreateViewHolder(inflater: LayoutInflater, parent: ViewGroup): ViewHolder {
        return ViewHolder(inflater.inflate(R.layout.item_comment_parent,parent,false))
    }

    open class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    }
}