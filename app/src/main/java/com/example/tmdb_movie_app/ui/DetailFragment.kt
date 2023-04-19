package com.example.tmdb_movie_app.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import coil.load
import coil.size.Scale
import coil.transform.RoundedCornersTransformation
import com.example.tmdb_movie_app.MovieViewModel
import com.example.tmdb_movie_app.R
import com.example.tmdb_movie_app.api.ApiClient
import com.example.tmdb_movie_app.api.Constance.POSTER_BASE_URL
import com.example.tmdb_movie_app.databinding.FragmentDetailBinding
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding
    private val args: DetailFragmentArgs by navArgs()
    private val api = ApiClient.MovieApi.api
    private val viewModel: MovieViewModel by activityViewModels()
    private var id = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        arguments?.let {
            id = it.getInt("id")

        }
        if (id > 0) {

            viewModel.loadDetail(id)
            viewModel.loadDetailVideo(id)
            viewModel.watchProvider(id)

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        Log.d("MYTAG", id.toString())

        binding.apply {
            viewModel.detail.observe(viewLifecycleOwner) {
                tvTitle.text = it?.title
                val vote = String.format("%.1f", it.vote_average)
                tvVote.text = vote
                tvBerblick.text = it?.overview
                genres1.text = it?.genres?.get(0)?.name



                // TODO: Image Variable
                val image = POSTER_BASE_URL + it.poster_path

                // TODO: Movie Background Image
                imageBack.load(image) {
                    crossfade(true)
                    scale(Scale.FILL)
                    placeholder(R.drawable.the_last_2)
                }

                // TODO: Movie Image
                imagePath.load(image) {
                    crossfade(true)
                    placeholder(R.drawable.the_last_2)
                    scale(Scale.FILL)
                }

            }
        }

        // TODO: Stream Provider

        viewModel.watchProvider.observe(viewLifecycleOwner) {

            binding.ProviderCard.visibility = View.GONE
            it?.let {
                if (it?.flatrate?.isNotEmpty() == true) {
                    binding.ProviderCard.visibility = View.VISIBLE
                    val image = POSTER_BASE_URL + it.flatrate.get(0).logoPath
                    binding.tvProvider.text = "Als Stream Verfügbar"
                    binding.tvProviderName.text = it.flatrate.get(0).providerName
                    binding.ivProvider.load(image) {
                        crossfade(true)
                        scale(Scale.FILL)
                        transformations(RoundedCornersTransformation(30f))
                    }
                } else if (it.buy.isNotEmpty()) {
                    val imageBuy = POSTER_BASE_URL + it.buy.get(0).logoPath
                    binding.ProviderCard.visibility = View.VISIBLE
                    val image = POSTER_BASE_URL + it.buy.get(0).logoPath
                    binding.tvProvider.text = "Als Kauf Verfügbar"
                    binding.tvProviderName.text = it.buy.get(0).providerName
                    binding.ivProvider.load(imageBuy) {
                        crossfade(true)
                        scale(Scale.FILL)
                        transformations(RoundedCornersTransformation(30f))
                    }
                } else if (it.rent.isNotEmpty()) {
                    val imageRent = POSTER_BASE_URL + it.rent.get(0).logoPath
                    binding.ProviderCard.visibility = View.VISIBLE
                    val image = POSTER_BASE_URL + it.rent.get(0).logoPath
                    binding.tvProvider.text = "Als Miet Verfügbar"
                    binding.tvProviderName.text = it.rent.get(0).providerName
                    binding.ivProvider.load(imageRent) {
                        crossfade(true)
                        scale(Scale.FILL)
                        transformations(RoundedCornersTransformation(30f))
                    }
                } else {
                    binding.ProviderCard.visibility = View.GONE
                }


            }

        }


        // TODO: Trilar eingebunden

        binding.btnTrailer.setOnClickListener {
            lifecycle.addObserver(binding.youtubePlayer)

            val videoId = viewModel.detailVideo?.let {
                it.value?.results?.find { it.type == "Trailer" }?.key
            }

            Log.d("MYTAG", videoId.toString())
            binding.youtubePlayer.visibility = View.VISIBLE
            binding.imagePath.visibility = View.GONE
            binding.imageBack.visibility = View.GONE


            viewModel.detailVideo.observe(viewLifecycleOwner) {

                    binding.youtubePlayer.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
                        override fun onReady(youTubePlayer: YouTubePlayer) {
                            youTubePlayer.loadVideo(videoId = videoId.toString(), 0f)
                        }

                    })

            }


        }
// TODO: Movie Recommendations
//        viewModel.listRecommendation.observe(viewLifecycleOwner, Observer {
//            Log.d("MYTAG","Vorschlag: ${it.totalResults}")
//        })

    }

}