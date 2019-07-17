package tracyeminem.com.tiktokcomment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list_comment.*
import me.drakeet.multitype.MultiTypeAdapter
import tracyeminem.com.peipei.adapter.ChildCommentAdapter
import tracyeminem.com.peipei.adapter.LoadMoreAdapter
import tracyeminem.com.peipei.adapter.ParentCommentAdapter
import tracyeminem.com.peipei.model.ChildComment
import tracyeminem.com.peipei.model.LoadMoreBean
import tracyeminem.com.peipei.model.ParentComment


class MainActivity : AppCompatActivity() {

    internal var multiTypeAdapter: MultiTypeAdapter? = null
    lateinit var items:MutableList<Any>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_comment)
        val loadMoreAdapter = LoadMoreAdapter()
        val parentCommentAdapter = ParentCommentAdapter()
        val childCommentAdapter = ChildCommentAdapter()

        items = ArrayList()
        multiTypeAdapter = MultiTypeAdapter()
        multiTypeAdapter!!.register(loadMoreAdapter)
        multiTypeAdapter!!.register(parentCommentAdapter)
        multiTypeAdapter!!.register(childCommentAdapter)
        multiTypeAdapter!!.items = items

        rv_comment.adapter = multiTypeAdapter
        rv_comment.layoutManager = LinearLayoutManager(this)

        for (i in 0..20){
            if(i % 2 == 0){
                items.add(ParentComment("parent"))
            }else{
                items.add(ParentComment("parent"))
                for (i in 0..3){
                    items.add(ChildComment("child"))
                }
                items.add(LoadMoreBean("加载更多"))
            }
        }

        multiTypeAdapter!!.notifyDataSetChanged()

        loadMoreAdapter.onLoadMoreInterface = object : LoadMoreAdapter.onLoadMore {
            override fun onLoadMore(position: Int) {
                for(i in 0..5) {
                    items.add(position, ChildComment("child"))
                }
                multiTypeAdapter!!.items = items
                multiTypeAdapter!!.notifyItemRangeInserted(position,6)
            }
        }
    }
}
