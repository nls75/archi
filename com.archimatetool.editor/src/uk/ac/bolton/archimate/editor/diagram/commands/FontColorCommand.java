/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package uk.ac.bolton.archimate.editor.diagram.commands;

import uk.ac.bolton.archimate.editor.model.commands.EObjectFeatureCommand;
import uk.ac.bolton.archimate.model.IArchimatePackage;
import uk.ac.bolton.archimate.model.IFontAttribute;


/**
 * Font Color Command
 *
 * @author Phillip Beauvoir
 */
public class FontColorCommand extends EObjectFeatureCommand {
    
    public FontColorCommand(IFontAttribute object, String rgb) {
        super(Messages.FontColorCommand_0, object, IArchimatePackage.Literals.FONT_ATTRIBUTE__FONT_COLOR, rgb);
    }
}