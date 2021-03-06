package SevenZip;

public interface IArchiveExtractCallback extends SevenZip.IProgress {
    
    // GetStream OUT: S_OK - OK, S_FALSE - skip this file
    int GetStream(int index, java.io.OutputStream [] outStream,  int askExtractMode) throws java.io.IOException;
    
    int PrepareOperation(int askExtractMode);
    int SetOperationResult(int resultEOperationResult) throws java.io.IOException;
}
