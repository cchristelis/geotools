/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.validation;

import net.opengis.gml.AbstractGMLType;
import net.opengis.gml.AbstractGeometricPrimitiveType;
import net.opengis.gml.AbstractGeometryType;
import net.opengis.gml.AbstractMetaDataType;
import net.opengis.gml.AbstractRingPropertyType;
import net.opengis.gml.AbstractRingType;
import net.opengis.gml.AbstractSurfaceType;
import net.opengis.gml.BoundingShapeType;
import net.opengis.gml.CodeType;
import net.opengis.gml.DirectPositionType;
import net.opengis.gml.EnvelopeType;
import net.opengis.gml.EnvelopeWithTimePeriodType;
import net.opengis.gml.GridType;
import net.opengis.gml.LinearRingType;
import net.opengis.gml.MetaDataPropertyType;
import net.opengis.gml.PolygonType;
import net.opengis.gml.RectifiedGridType;
import net.opengis.gml.StringOrRefType;
import net.opengis.gml.TimePositionType;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * A sample validator interface for {@link net.opengis.gml.DocumentRoot}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DocumentRootValidator {
    boolean validate();

    boolean validateMixed(FeatureMap value);
    boolean validateXMLNSPrefixMap(EMap value);
    boolean validateXSISchemaLocation(EMap value);
    boolean validateGeometricPrimitive(AbstractGeometricPrimitiveType value);
    boolean validateGeometry(AbstractGeometryType value);
    boolean validateGML(AbstractGMLType value);
    boolean validateObject(EObject value);
    boolean validateMetaData(AbstractMetaDataType value);
    boolean validateRing(AbstractRingType value);
    boolean validateSurface(AbstractSurfaceType value);
    boolean validateBoundedBy(BoundingShapeType value);
    boolean validateDescription(StringOrRefType value);
    boolean validateEnvelope(EnvelopeType value);
    boolean validateEnvelopeWithTimePeriod(EnvelopeWithTimePeriodType value);
    boolean validateExterior(AbstractRingPropertyType value);
    boolean validateGrid(GridType value);
    boolean validateInterior(AbstractRingPropertyType value);
    boolean validateLinearRing(LinearRingType value);
    boolean validateMetaDataProperty(MetaDataPropertyType value);
    boolean validateName(CodeType value);
    boolean validatePolygon(PolygonType value);
    boolean validatePos(DirectPositionType value);
    boolean validateRectifiedGrid(RectifiedGridType value);
    boolean validateTimePosition(TimePositionType value);
    boolean validateId(String value);
    boolean validateRemoteSchema(String value);
}
