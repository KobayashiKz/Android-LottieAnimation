package com.kk.lottieanimation.lottieanimation

import android.animation.Animator
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animationView: LottieAnimationView = findViewById(R.id.animation_view)
        animationView.setOnClickListener {
            // ループなしでアニメーション再生
            animationView.setAnimation("LottieLogo2.json")
            animationView.loop(false)
            animationView.setSpeed(1.0f)
            animationView.playAnimation()
        }

        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener {
            // ループありでアニメーション再生
            animationView.setAnimation("bell.json")
            animationView.loop(true)
            animationView.setSpeed(1.0f)
            animationView.playAnimation()
        }

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            // アニメーションを逆再生
            animationView.setAnimation("birds.json")
            animationView.loop(false)
            animationView.setSpeed(1.0f)
            animationView.reverseAnimation()
        }

        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            // ループなしでアニメーション再生
            animationView.setAnimation("video_cam.json")
            animationView.loop(false)
            animationView.setSpeed(1.0f)
            animationView.playAnimation()
        }

        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener {
            // 3倍速でアニメーション再生
            animationView.setAnimation("lego_loader.json")
            animationView.loop(false)
            animationView.setSpeed(3.0f)
            animationView.playAnimation()
        }

        val mStartButton: Button = findViewById(R.id.start_button)
        mStartButton.setOnClickListener {
            if (animationView.isAnimating) {
                // 再生中にタップした場合は一時停止
                animationView.pauseAnimation()
            } else {
                // 一時停止中にタップした場合はアニメーション再開
                animationView.resumeAnimation()
            }
        }

        val stopButton: Button = findViewById(R.id.stop_button)
        stopButton.setOnClickListener {
            // アニメーションを停止して、一番初めまで戻す
            animationView.cancelAnimation()
            animationView.progress = 0f
        }

        animationView.addAnimatorListener(
            object : Animator.AnimatorListener {
                override fun onAnimationStart(p0: Animator?) {
                    // do nothing.
                }
                override fun onAnimationRepeat(p0: Animator?) {
                    // do nothing.
                }
                override fun onAnimationCancel(p0: Animator?) {
                    // do nothing.
                }
                override fun onAnimationEnd(p0: Animator?) {
                    // do nothing.
                }
            }
        )
    }
}
