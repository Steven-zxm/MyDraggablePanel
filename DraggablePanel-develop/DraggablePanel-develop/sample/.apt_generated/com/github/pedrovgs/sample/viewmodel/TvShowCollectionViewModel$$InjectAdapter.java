// Code generated by dagger-compiler.  Do not edit.
package com.github.pedrovgs.sample.viewmodel;


import dagger.internal.Binding;
import javax.inject.Provider;

/**
 * A {@code Binder<TvShowCollectionViewModel>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 *
 * Being a {@code Provider<TvShowCollectionViewModel>} and handling creation and
 * preparation of object instances.
 */
public final class TvShowCollectionViewModel$$InjectAdapter extends Binding<TvShowCollectionViewModel>
    implements Provider<TvShowCollectionViewModel> {

  public TvShowCollectionViewModel$$InjectAdapter() {
    super("com.github.pedrovgs.sample.viewmodel.TvShowCollectionViewModel", "members/com.github.pedrovgs.sample.viewmodel.TvShowCollectionViewModel", NOT_SINGLETON, TvShowCollectionViewModel.class);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<TvShowCollectionViewModel>}.
   */
  @Override
  public TvShowCollectionViewModel get() {
    TvShowCollectionViewModel result = new TvShowCollectionViewModel();
    return result;
  }
}
