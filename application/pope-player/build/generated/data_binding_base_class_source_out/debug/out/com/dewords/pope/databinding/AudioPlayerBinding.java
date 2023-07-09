// Generated by data binding compiler. Do not edit!
package com.dewords.pope.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.dewords.pope.R;
import com.dewords.pope.gui.audio.AudioPlayer;
import com.dewords.pope.gui.view.AccessibleSeekBar;
import com.dewords.pope.gui.view.CoverMediaSwitcher;
import com.dewords.pope.gui.view.HeaderMediaSwitcher;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AudioPlayerBinding extends ViewDataBinding {
  @NonNull
  public final View abRepeatContainer;

  @NonNull
  public final ImageView abRepeatMarkerA;

  @NonNull
  public final ImageView abRepeatMarkerB;

  @NonNull
  public final Guideline abRepeatMarkerGuidelineA;

  @NonNull
  public final Guideline abRepeatMarkerGuidelineB;

  @NonNull
  public final ConstraintLayout abRepeatMarkerGuidelineContainer;

  @NonNull
  public final ImageView abRepeatReset;

  @NonNull
  public final ImageView abRepeatStop;

  @NonNull
  public final ImageView advFunction;

  @NonNull
  public final ImageView audioForward10;

  @NonNull
  public final TextView audioForwardText;

  @NonNull
  public final HeaderMediaSwitcher audioMediaSwitcher;

  @NonNull
  public final TextView audioPlayProgress;

  @NonNull
  public final ImageView audioRewind10;

  @NonNull
  public final TextView audioRewindText;

  @NonNull
  public final ImageView backgroundView;

  @NonNull
  public final Barrier barrier;

  @NonNull
  public final ConstraintLayout bookmarkMarkerContainer;

  @NonNull
  public final ViewStubProxy bookmarksStub;

  @NonNull
  public final View bottomGradient;

  @NonNull
  public final Guideline centerGuideline;

  @NonNull
  public final ConstraintLayout contentLayout;

  @NonNull
  public final CoverMediaSwitcher coverMediaSwitcher;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final Guideline guideline13;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final Guideline guideline14;

  @NonNull
  public final Guideline guideline8;

  @NonNull
  public final Guideline guideline9;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   */
  @Nullable
  public final Guideline guidelineHeaderBottom;

  @NonNull
  public final ConstraintLayout header;

  @NonNull
  public final View headerBackground;

  @NonNull
  public final View headerDivider;

  @NonNull
  public final AppCompatImageView headerLargePlayPause;

  @NonNull
  public final ImageView headerNext;

  @NonNull
  public final ImageView headerPlayPause;

  @NonNull
  public final ImageView headerPrevious;

  @NonNull
  public final ImageView headerRepeat;

  @NonNull
  public final ImageView headerShuffle;

  @NonNull
  public final TextView headerTime;

  @NonNull
  public final ImageView hingeGoLeft;

  @NonNull
  public final ImageView hingeGoRight;

  @NonNull
  public final TextView length;

  @NonNull
  public final ImageView next;

  @NonNull
  public final AppCompatImageView playPause;

  @NonNull
  public final ChipGroup playbackChips;

  @NonNull
  public final Chip playbackSpeedQuickAction;

  @NonNull
  public final FrameLayout playerOptionsContainer;

  @NonNull
  public final ViewStubProxy playerOptionsStub;

  @NonNull
  public final ImageView playlistSearch;

  @NonNull
  public final TextInputLayout playlistSearchText;

  @NonNull
  public final ImageView playlistSwitch;

  @NonNull
  public final ImageView previous;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final ImageView repeat;

  @NonNull
  public final ImageView shuffle;

  @NonNull
  public final Chip sleepQuickAction;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final TextView songSubtitle;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final TextView songTitle;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final TextView songTrackInfo;

  @NonNull
  public final RecyclerView songsList;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   */
  @Nullable
  public final View songsListGuide;

  @NonNull
  public final TextView time;

  @NonNull
  public final AccessibleSeekBar timeline;

  @NonNull
  public final View topGradient;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final ConstraintLayout trackInfoContainer;

  @Bindable
  protected AudioPlayer mFragment;

  @Bindable
  protected Float mAbRepeatA;

  @Bindable
  protected Float mAbRepeatB;

  @Bindable
  protected Boolean mCanShuffle;

  protected AudioPlayerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      View abRepeatContainer, ImageView abRepeatMarkerA, ImageView abRepeatMarkerB,
      Guideline abRepeatMarkerGuidelineA, Guideline abRepeatMarkerGuidelineB,
      ConstraintLayout abRepeatMarkerGuidelineContainer, ImageView abRepeatReset,
      ImageView abRepeatStop, ImageView advFunction, ImageView audioForward10,
      TextView audioForwardText, HeaderMediaSwitcher audioMediaSwitcher, TextView audioPlayProgress,
      ImageView audioRewind10, TextView audioRewindText, ImageView backgroundView, Barrier barrier,
      ConstraintLayout bookmarkMarkerContainer, ViewStubProxy bookmarksStub, View bottomGradient,
      Guideline centerGuideline, ConstraintLayout contentLayout,
      CoverMediaSwitcher coverMediaSwitcher, Guideline guideline13, Guideline guideline14,
      Guideline guideline8, Guideline guideline9, Guideline guidelineHeaderBottom,
      ConstraintLayout header, View headerBackground, View headerDivider,
      AppCompatImageView headerLargePlayPause, ImageView headerNext, ImageView headerPlayPause,
      ImageView headerPrevious, ImageView headerRepeat, ImageView headerShuffle,
      TextView headerTime, ImageView hingeGoLeft, ImageView hingeGoRight, TextView length,
      ImageView next, AppCompatImageView playPause, ChipGroup playbackChips,
      Chip playbackSpeedQuickAction, FrameLayout playerOptionsContainer,
      ViewStubProxy playerOptionsStub, ImageView playlistSearch, TextInputLayout playlistSearchText,
      ImageView playlistSwitch, ImageView previous, ProgressBar progressBar, ImageView repeat,
      ImageView shuffle, Chip sleepQuickAction, TextView songSubtitle, TextView songTitle,
      TextView songTrackInfo, RecyclerView songsList, View songsListGuide, TextView time,
      AccessibleSeekBar timeline, View topGradient, ConstraintLayout trackInfoContainer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.abRepeatContainer = abRepeatContainer;
    this.abRepeatMarkerA = abRepeatMarkerA;
    this.abRepeatMarkerB = abRepeatMarkerB;
    this.abRepeatMarkerGuidelineA = abRepeatMarkerGuidelineA;
    this.abRepeatMarkerGuidelineB = abRepeatMarkerGuidelineB;
    this.abRepeatMarkerGuidelineContainer = abRepeatMarkerGuidelineContainer;
    this.abRepeatReset = abRepeatReset;
    this.abRepeatStop = abRepeatStop;
    this.advFunction = advFunction;
    this.audioForward10 = audioForward10;
    this.audioForwardText = audioForwardText;
    this.audioMediaSwitcher = audioMediaSwitcher;
    this.audioPlayProgress = audioPlayProgress;
    this.audioRewind10 = audioRewind10;
    this.audioRewindText = audioRewindText;
    this.backgroundView = backgroundView;
    this.barrier = barrier;
    this.bookmarkMarkerContainer = bookmarkMarkerContainer;
    this.bookmarksStub = bookmarksStub;
    this.bottomGradient = bottomGradient;
    this.centerGuideline = centerGuideline;
    this.contentLayout = contentLayout;
    this.coverMediaSwitcher = coverMediaSwitcher;
    this.guideline13 = guideline13;
    this.guideline14 = guideline14;
    this.guideline8 = guideline8;
    this.guideline9 = guideline9;
    this.guidelineHeaderBottom = guidelineHeaderBottom;
    this.header = header;
    this.headerBackground = headerBackground;
    this.headerDivider = headerDivider;
    this.headerLargePlayPause = headerLargePlayPause;
    this.headerNext = headerNext;
    this.headerPlayPause = headerPlayPause;
    this.headerPrevious = headerPrevious;
    this.headerRepeat = headerRepeat;
    this.headerShuffle = headerShuffle;
    this.headerTime = headerTime;
    this.hingeGoLeft = hingeGoLeft;
    this.hingeGoRight = hingeGoRight;
    this.length = length;
    this.next = next;
    this.playPause = playPause;
    this.playbackChips = playbackChips;
    this.playbackSpeedQuickAction = playbackSpeedQuickAction;
    this.playerOptionsContainer = playerOptionsContainer;
    this.playerOptionsStub = playerOptionsStub;
    this.playlistSearch = playlistSearch;
    this.playlistSearchText = playlistSearchText;
    this.playlistSwitch = playlistSwitch;
    this.previous = previous;
    this.progressBar = progressBar;
    this.repeat = repeat;
    this.shuffle = shuffle;
    this.sleepQuickAction = sleepQuickAction;
    this.songSubtitle = songSubtitle;
    this.songTitle = songTitle;
    this.songTrackInfo = songTrackInfo;
    this.songsList = songsList;
    this.songsListGuide = songsListGuide;
    this.time = time;
    this.timeline = timeline;
    this.topGradient = topGradient;
    this.trackInfoContainer = trackInfoContainer;
  }

  public abstract void setFragment(@Nullable AudioPlayer fragment);

  @Nullable
  public AudioPlayer getFragment() {
    return mFragment;
  }

  public abstract void setAbRepeatA(@Nullable Float ab_repeat_a);

  @Nullable
  public Float getAbRepeatA() {
    return mAbRepeatA;
  }

  public abstract void setAbRepeatB(@Nullable Float ab_repeat_b);

  @Nullable
  public Float getAbRepeatB() {
    return mAbRepeatB;
  }

  public abstract void setCanShuffle(@Nullable Boolean can_shuffle);

  @Nullable
  public Boolean getCanShuffle() {
    return mCanShuffle;
  }

  @NonNull
  public static AudioPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.audio_player, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AudioPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AudioPlayerBinding>inflateInternal(inflater, R.layout.audio_player, root, attachToRoot, component);
  }

  @NonNull
  public static AudioPlayerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.audio_player, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AudioPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AudioPlayerBinding>inflateInternal(inflater, R.layout.audio_player, null, false, component);
  }

  public static AudioPlayerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static AudioPlayerBinding bind(@NonNull View view, @Nullable Object component) {
    return (AudioPlayerBinding)bind(component, view, R.layout.audio_player);
  }
}
