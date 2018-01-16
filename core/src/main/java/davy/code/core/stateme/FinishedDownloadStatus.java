package davy.code.core.stateme;

import davy.code.core.DownloadContext;
import davy.code.core.exception.DownloadException;
import davy.code.core.IDownloadState;

/**
 * author: wangyonghua
 * version: V1.0
 * date: 2018/1/16
 * time: 20:14
 */

public class FinishedDownloadStatus implements IDownloadState {

    @Override
    public int getStatus() {
        return STATUS_FINISHED;
    }

    @Override
    public void handle(DownloadContext downloadContext) throws DownloadException {

    }
}
