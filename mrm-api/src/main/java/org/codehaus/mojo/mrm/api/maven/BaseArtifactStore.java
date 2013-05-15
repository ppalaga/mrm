package org.codehaus.mojo.mrm.api.maven;

import java.io.IOException;
import java.io.InputStream;

import org.apache.maven.archetype.catalog.ArchetypeCatalog;

/**
 * Base implementation of {@link ArtifactStore}.
 *
 * @serial
 * @since 1.0
 */
public abstract class BaseArtifactStore
    implements ArtifactStore
{

    /**
     * Ensure consistent serialization.
     *
     * @since 1.0
     */
    private static final long serialVersionUID = 1L;

    /**
     * {@inheritDoc}
     */
    public void set( Artifact artifact, InputStream content )
        throws IOException
    {
        throw new UnsupportedOperationException( "Read-only artifact store" );
    }
    
    /**
     * {@inheritDoc}
     */
    public void setArchetypeCatalog( InputStream content )
        throws IOException
    {
        throw new UnsupportedOperationException( "Read-only artifact store" );
    }
    
    /**
     * {@inheritDoc}
     */
    public ArchetypeCatalog getArchetypeCatalog()
        throws IOException, ArchetypeCatalogNotFoundException
    {
        throw new UnsupportedOperationException( "getArchetypeCatalog() has not been implemented" );
    }
    
    /**
     * {@inheritDoc}
     */
    public long getArchetypeCatalogLastModified()
        throws IOException, ArchetypeCatalogNotFoundException
    {
        throw new UnsupportedOperationException( "getArchetypeCatalogLastModified() has not been implemented" );
    }
}
