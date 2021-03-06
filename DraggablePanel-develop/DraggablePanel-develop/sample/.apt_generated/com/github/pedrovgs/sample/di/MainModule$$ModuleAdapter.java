// Code generated by dagger-compiler.  Do not edit.
package com.github.pedrovgs.sample.di;


import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ModuleAdapter;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

/**
 * A manager of modules and provides adapters allowing for proper linking and
 * instance provision of types served by {@code @Provides} methods.
 */
public final class MainModule$$ModuleAdapter extends ModuleAdapter<MainModule> {
  private static final String[] INJECTS = { "members/com.github.pedrovgs.sample.activity.PlacesSampleActivity", "members/com.github.pedrovgs.sample.activity.TvShowsActivity", "members/com.github.pedrovgs.sample.DraggablePanelApplication", };
  private static final Class<?>[] STATIC_INJECTIONS = { };
  private static final Class<?>[] INCLUDES = { };

  public MainModule$$ModuleAdapter() {
    super(INJECTS, STATIC_INJECTIONS, false /*overrides*/, INCLUDES, true /*complete*/, false /*library*/);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getBindings(Map<String, Binding<?>> map) {
    map.put("android.view.LayoutInflater", new ProvideLayoutInflaterProvidesAdapter(module));
    map.put("com.github.pedrovgs.sample.renderer.rendererbuilder.TvShowCollectionRendererBuilder", new ProvideTvShowCollectionRendererBuilderProvidesAdapter(module));
    map.put("com.pedrogomez.renderers.RendererAdapter<com.github.pedrovgs.sample.viewmodel.PlaceViewModel>", new ProvidePlacesRendererAdapterProvidesAdapter(module));
    map.put("com.pedrogomez.renderers.RendererAdapter<com.github.pedrovgs.sample.viewmodel.TvShowViewModel>", new ProvideTvShowRendererAdapterProvidesAdapter(module));
    map.put("android.content.Context", new ProvideContextProvidesAdapter(module));
    map.put("com.github.pedrovgs.sample.renderer.rendererbuilder.PlacesCollectionRendererBuilder", new ProvidePlaceCollectionRendererBuilderProvidesAdapter(module));
  }

  /**
   * A {@code Binder<android.view.LayoutInflater>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Being a {@code Provider<android.view.LayoutInflater>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideLayoutInflaterProvidesAdapter extends Binding<android.view.LayoutInflater>
      implements Provider<android.view.LayoutInflater> {
    private final MainModule module;

    public ProvideLayoutInflaterProvidesAdapter(MainModule module) {
      super("android.view.LayoutInflater", null, NOT_SINGLETON, "com.github.pedrovgs.sample.di.MainModule.provideLayoutInflater()");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<android.view.LayoutInflater>}.
     */
    @Override
    public android.view.LayoutInflater get() {
      return module.provideLayoutInflater();
    }
  }

  /**
   * A {@code Binder<com.github.pedrovgs.sample.renderer.rendererbuilder.TvShowCollectionRendererBuilder>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Owning the dependency links between {@code com.github.pedrovgs.sample.renderer.rendererbuilder.TvShowCollectionRendererBuilder} and its
   * dependencies.
   *
   * Being a {@code Provider<com.github.pedrovgs.sample.renderer.rendererbuilder.TvShowCollectionRendererBuilder>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideTvShowCollectionRendererBuilderProvidesAdapter extends Binding<com.github.pedrovgs.sample.renderer.rendererbuilder.TvShowCollectionRendererBuilder>
      implements Provider<com.github.pedrovgs.sample.renderer.rendererbuilder.TvShowCollectionRendererBuilder> {
    private final MainModule module;
    private Binding<android.content.Context> context;

    public ProvideTvShowCollectionRendererBuilderProvidesAdapter(MainModule module) {
      super("com.github.pedrovgs.sample.renderer.rendererbuilder.TvShowCollectionRendererBuilder", null, NOT_SINGLETON, "com.github.pedrovgs.sample.di.MainModule.provideTvShowCollectionRendererBuilder()");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      context = (Binding<android.content.Context>) linker.requestBinding("android.content.Context", MainModule.class, getClass().getClassLoader());
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(context);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.github.pedrovgs.sample.renderer.rendererbuilder.TvShowCollectionRendererBuilder>}.
     */
    @Override
    public com.github.pedrovgs.sample.renderer.rendererbuilder.TvShowCollectionRendererBuilder get() {
      return module.provideTvShowCollectionRendererBuilder(context.get());
    }
  }

  /**
   * A {@code Binder<com.pedrogomez.renderers.RendererAdapter<com.github.pedrovgs.sample.viewmodel.PlaceViewModel>>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Owning the dependency links between {@code com.pedrogomez.renderers.RendererAdapter<com.github.pedrovgs.sample.viewmodel.PlaceViewModel>} and its
   * dependencies.
   *
   * Being a {@code Provider<com.pedrogomez.renderers.RendererAdapter<com.github.pedrovgs.sample.viewmodel.PlaceViewModel>>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvidePlacesRendererAdapterProvidesAdapter extends Binding<com.pedrogomez.renderers.RendererAdapter<com.github.pedrovgs.sample.viewmodel.PlaceViewModel>>
      implements Provider<com.pedrogomez.renderers.RendererAdapter<com.github.pedrovgs.sample.viewmodel.PlaceViewModel>> {
    private final MainModule module;
    private Binding<android.view.LayoutInflater> layoutInflater;
    private Binding<com.github.pedrovgs.sample.renderer.rendererbuilder.PlacesCollectionRendererBuilder> placesCollectionRendererBuilder;
    private Binding<com.github.pedrovgs.sample.viewmodel.PlaceCollectionViewModel> placeCollectionViewModel;

    public ProvidePlacesRendererAdapterProvidesAdapter(MainModule module) {
      super("com.pedrogomez.renderers.RendererAdapter<com.github.pedrovgs.sample.viewmodel.PlaceViewModel>", null, NOT_SINGLETON, "com.github.pedrovgs.sample.di.MainModule.providePlacesRendererAdapter()");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      layoutInflater = (Binding<android.view.LayoutInflater>) linker.requestBinding("android.view.LayoutInflater", MainModule.class, getClass().getClassLoader());
      placesCollectionRendererBuilder = (Binding<com.github.pedrovgs.sample.renderer.rendererbuilder.PlacesCollectionRendererBuilder>) linker.requestBinding("com.github.pedrovgs.sample.renderer.rendererbuilder.PlacesCollectionRendererBuilder", MainModule.class, getClass().getClassLoader());
      placeCollectionViewModel = (Binding<com.github.pedrovgs.sample.viewmodel.PlaceCollectionViewModel>) linker.requestBinding("com.github.pedrovgs.sample.viewmodel.PlaceCollectionViewModel", MainModule.class, getClass().getClassLoader());
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(layoutInflater);
      getBindings.add(placesCollectionRendererBuilder);
      getBindings.add(placeCollectionViewModel);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.pedrogomez.renderers.RendererAdapter<com.github.pedrovgs.sample.viewmodel.PlaceViewModel>>}.
     */
    @Override
    public com.pedrogomez.renderers.RendererAdapter<com.github.pedrovgs.sample.viewmodel.PlaceViewModel> get() {
      return module.providePlacesRendererAdapter(layoutInflater.get(), placesCollectionRendererBuilder.get(), placeCollectionViewModel.get());
    }
  }

  /**
   * A {@code Binder<com.pedrogomez.renderers.RendererAdapter<com.github.pedrovgs.sample.viewmodel.TvShowViewModel>>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Owning the dependency links between {@code com.pedrogomez.renderers.RendererAdapter<com.github.pedrovgs.sample.viewmodel.TvShowViewModel>} and its
   * dependencies.
   *
   * Being a {@code Provider<com.pedrogomez.renderers.RendererAdapter<com.github.pedrovgs.sample.viewmodel.TvShowViewModel>>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideTvShowRendererAdapterProvidesAdapter extends Binding<com.pedrogomez.renderers.RendererAdapter<com.github.pedrovgs.sample.viewmodel.TvShowViewModel>>
      implements Provider<com.pedrogomez.renderers.RendererAdapter<com.github.pedrovgs.sample.viewmodel.TvShowViewModel>> {
    private final MainModule module;
    private Binding<android.view.LayoutInflater> layoutInflater;
    private Binding<com.github.pedrovgs.sample.renderer.rendererbuilder.TvShowCollectionRendererBuilder> tvShowCollectionRendererBuilder;
    private Binding<com.github.pedrovgs.sample.viewmodel.TvShowCollectionViewModel> tvShowCollectionViewModel;

    public ProvideTvShowRendererAdapterProvidesAdapter(MainModule module) {
      super("com.pedrogomez.renderers.RendererAdapter<com.github.pedrovgs.sample.viewmodel.TvShowViewModel>", null, NOT_SINGLETON, "com.github.pedrovgs.sample.di.MainModule.provideTvShowRendererAdapter()");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      layoutInflater = (Binding<android.view.LayoutInflater>) linker.requestBinding("android.view.LayoutInflater", MainModule.class, getClass().getClassLoader());
      tvShowCollectionRendererBuilder = (Binding<com.github.pedrovgs.sample.renderer.rendererbuilder.TvShowCollectionRendererBuilder>) linker.requestBinding("com.github.pedrovgs.sample.renderer.rendererbuilder.TvShowCollectionRendererBuilder", MainModule.class, getClass().getClassLoader());
      tvShowCollectionViewModel = (Binding<com.github.pedrovgs.sample.viewmodel.TvShowCollectionViewModel>) linker.requestBinding("com.github.pedrovgs.sample.viewmodel.TvShowCollectionViewModel", MainModule.class, getClass().getClassLoader());
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(layoutInflater);
      getBindings.add(tvShowCollectionRendererBuilder);
      getBindings.add(tvShowCollectionViewModel);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.pedrogomez.renderers.RendererAdapter<com.github.pedrovgs.sample.viewmodel.TvShowViewModel>>}.
     */
    @Override
    public com.pedrogomez.renderers.RendererAdapter<com.github.pedrovgs.sample.viewmodel.TvShowViewModel> get() {
      return module.provideTvShowRendererAdapter(layoutInflater.get(), tvShowCollectionRendererBuilder.get(), tvShowCollectionViewModel.get());
    }
  }

  /**
   * A {@code Binder<android.content.Context>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Being a {@code Provider<android.content.Context>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideContextProvidesAdapter extends Binding<android.content.Context>
      implements Provider<android.content.Context> {
    private final MainModule module;

    public ProvideContextProvidesAdapter(MainModule module) {
      super("android.content.Context", null, NOT_SINGLETON, "com.github.pedrovgs.sample.di.MainModule.provideContext()");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<android.content.Context>}.
     */
    @Override
    public android.content.Context get() {
      return module.provideContext();
    }
  }

  /**
   * A {@code Binder<com.github.pedrovgs.sample.renderer.rendererbuilder.PlacesCollectionRendererBuilder>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Owning the dependency links between {@code com.github.pedrovgs.sample.renderer.rendererbuilder.PlacesCollectionRendererBuilder} and its
   * dependencies.
   *
   * Being a {@code Provider<com.github.pedrovgs.sample.renderer.rendererbuilder.PlacesCollectionRendererBuilder>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvidePlaceCollectionRendererBuilderProvidesAdapter extends Binding<com.github.pedrovgs.sample.renderer.rendererbuilder.PlacesCollectionRendererBuilder>
      implements Provider<com.github.pedrovgs.sample.renderer.rendererbuilder.PlacesCollectionRendererBuilder> {
    private final MainModule module;
    private Binding<android.content.Context> context;

    public ProvidePlaceCollectionRendererBuilderProvidesAdapter(MainModule module) {
      super("com.github.pedrovgs.sample.renderer.rendererbuilder.PlacesCollectionRendererBuilder", null, NOT_SINGLETON, "com.github.pedrovgs.sample.di.MainModule.providePlaceCollectionRendererBuilder()");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      context = (Binding<android.content.Context>) linker.requestBinding("android.content.Context", MainModule.class, getClass().getClassLoader());
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(context);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.github.pedrovgs.sample.renderer.rendererbuilder.PlacesCollectionRendererBuilder>}.
     */
    @Override
    public com.github.pedrovgs.sample.renderer.rendererbuilder.PlacesCollectionRendererBuilder get() {
      return module.providePlaceCollectionRendererBuilder(context.get());
    }
  }
}
