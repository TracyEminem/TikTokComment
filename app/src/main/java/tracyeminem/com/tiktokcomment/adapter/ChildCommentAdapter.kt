package tracyeminem.com.peipei.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import me.drakeet.multitype.ItemViewBinder
import tracyeminem.com.peipei.model.ChildComment
import tracyeminem.com.tiktokcomment.R

/**
 * Created by TracyEminem on 2019/7/12 下午10:39.
 */
class ChildCommentAdapter : ItemViewBinder<ChildComment, ChildCommentAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, item: ChildComment) {

    }

    override fun onCreateViewHolder(inflater: LayoutInflater, parent: ViewGroup): ViewHolder {
        return ViewHolder(inflater.inflate(R.layout.item_comment_child,parent,false))
    }


    open class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    }

}